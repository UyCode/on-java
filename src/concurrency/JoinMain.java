package concurrency;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/8/2021 6:28 PM
 */

public class JoinMain {

    public final static long MILLION = 1_000_000L;
    public volatile static int i = 0;

    public static class JoinThread extends Thread {
        @Override
        public void run() {
            for (i = 0; i <MILLION; ++i){};
        }
    }

    public static void main(String[] args) throws InterruptedException{
        JoinThread thread = new JoinThread();
        thread.start();
        // if remove the join, then the result of i maybe 0  or less than one MILLION.
        thread.join();
        System.out.println(i);
    }
}
