package concurrency;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/8/2021 7:07 PM
 */

public class ThreadGroups implements Runnable{

    @Override
    public void run() {
        String groupName = Thread.currentThread().getThreadGroup().getName() + "-" + Thread.currentThread().getName();

        while (true) {
            System.out.println("CurrentThread is: " + groupName);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadGroup threads = new ThreadGroup("GroupOne");
        Thread thread1 = new Thread(threads, new ThreadGroups(), "T1");
        Thread thread2 = new Thread(threads, new ThreadGroups(), "T2");

        thread1.start();
        thread2.start();
        System.out.println(threads.activeCount());
        threads.list();
    }
}
