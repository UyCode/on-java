package southwind.deadlock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/25/2021 22:46
 */

public class DeadLockRunnable implements Runnable{

    public int num;
    private static Chopsticks chopsticks1 = new Chopsticks();
    private static Chopsticks chopsticks2 = new Chopsticks();

    @Override
    public void run() {
        if(num == 1) {
            synchronized (chopsticks1) {
                System.out.println(Thread.currentThread().getName() + "拿到了筷子1，等待筷子2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (chopsticks2) {
                    System.out.println(Thread.currentThread().getName() + "吃饭完毕");
                }
            }
        }
        if(num == 2) {
            synchronized (chopsticks2) {
                System.out.println(Thread.currentThread().getName() + "拿到了筷子2，等待筷子1");
                synchronized (chopsticks1) {
                    System.out.println(Thread.currentThread().getName() + "吃饭完毕");
                }
            }
        }
    }
}
