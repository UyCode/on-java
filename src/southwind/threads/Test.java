package southwind.threads;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/24/2021 18:12
 */

public class Test {

    public static void main(String[] args) {
        Runnable target = new MyThread();
        Thread thread = new Thread(target);
        System.out.println(thread.getState());
        thread.start();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(thread.getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}
