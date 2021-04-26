package southwind.juc;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/26/2021 23:06
 */

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(() -> {account.count();},"线程A");
        Thread thread2 = new Thread(() -> {account.count();},"线程B");
        thread1.start();
        thread2.start();
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(thread2.getName()+"等待时间已超过1秒，主动中断" + thread1.getName());
            thread1.interrupt();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Account {
    private static int num;
    private ReentrantLock lock = new ReentrantLock();
    public void count() {

        try {
            lock.lockInterruptibly();
            TimeUnit.SECONDS.sleep(3);
            num++;
            System.out.println(Thread.currentThread().getName() + "是当前线程，获得了" + num);
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
