package southwind.concurrency.demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/3/2021 09:48
 */

public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                data.increment();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                data.decrement();
            }
        }, "B").start();
    }


}

class Data {
    private Integer num = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() {
        lock.lock();
        while (num != 0) {
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        condition.signal();
        System.out.println(Thread.currentThread().getName() + "获取了锁" + num);
        lock.unlock();
    }

    public void decrement() {
        lock.lock();
        while (num == 0) {
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        condition.signal();
        System.out.println(Thread.currentThread().getName() + "获取了锁" + num);
        lock.unlock();
    }
}