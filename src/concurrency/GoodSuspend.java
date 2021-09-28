package concurrency;

import java.io.Reader;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/8/2021 1:12 AM
 */

public class GoodSuspend {

    public static Object object = new Object();


    public static class ChangeObjectThread extends Thread {

        volatile boolean suspend = false;

        public void suspends() {
            suspend = true;
        }

        public void resumes() {
            suspend =false;
            synchronized (this) {
                notify();
            }
        }

        @Override
        public void run() {
            while(true) {
                synchronized (this) {
                    while (suspend) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                synchronized (object) {
                    System.out.println("in ChangeObjectThread");
                }
                Thread.yield();
            }
        }
    }

    public static class ReadObjectThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (object) {
                    System.out.println("in ReadObjectThread");
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ChangeObjectThread t1 = new ChangeObjectThread();
        ReadObjectThread t2 = new ReadObjectThread();
        t1.start();
        t1.start();
        t1.start();
        t1.start();
        t1.start();
        t2.start();
        Thread.sleep(1000);
        t1.suspends();
        System.out.println("suspend t1 2 sec");
        Thread.sleep(2000);
        System.out.println("resume t1");
        t1.resumes();
    }
}
