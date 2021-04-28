package southwind.ticket;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 21:13
 */

public class Ticket {
    private int remainCount = 15;
    private int outCount = 0;

    Lock lock = new ReentrantLock();

    public void sale() {
        while (remainCount > 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.lock();
            try {
                if (remainCount == 0) {
                    return;
                }
                remainCount--;
                outCount++;
                if (remainCount == 0) {
                    System.out.println(Thread.currentThread().getName() + "出售了第" + outCount + "张票，球票已售完");
                } else {

                    System.out.println(Thread.currentThread().getName() + "出售了第" + outCount + "张票，还剩" + remainCount + "张票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }


        }

    }
}
