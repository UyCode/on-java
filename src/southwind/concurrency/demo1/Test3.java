package southwind.concurrency.demo1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/2/2021 08:28
 */

public class Test3 {
    public static void main(String[] args) {
        TimeLock timeLock = new TimeLock();
        new Thread(() ->{timeLock.getLock();}, "A").start();
        new Thread(() ->{timeLock.getLock();}, "B").start();


    }
}

class TimeLock {
    private ReentrantLock lock = new ReentrantLock();

    public void getLock() {
        String threadName = Thread.currentThread().getName();

        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(threadName + "获取了锁");
                TimeUnit.SECONDS.sleep(5);
            } else {
                System.out.println(threadName + "无法获取锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
                System.out.println(threadName +"释放了锁");
            }
        }

    }
}