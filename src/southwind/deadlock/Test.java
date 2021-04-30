package southwind.deadlock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/25/2021 22:50
 */

public class Test {

    public static void main(String[] args) throws InterruptedException {
        DeadLockRunnable runnable1 = new DeadLockRunnable();
        runnable1.num = 1;

        DeadLockRunnable runnable2 = new DeadLockRunnable();
        runnable2.num = 2;

        Thread thread = new Thread(runnable1, "线程1");
        thread.start();
        Thread.sleep(1000);
        Thread thread2 = new Thread(runnable2, "线程2");
        thread2.start();
    }
}
