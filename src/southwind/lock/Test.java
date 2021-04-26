package southwind.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/26/2021 22:37
 */

public class Test {

    public static void main(String[] args) {
        Account account = new Account();

        new Thread(() -> {account.count();}, "A").start();
        new Thread(() -> {account.count();}, "B").start();
        new Thread(() -> {account.count();}, "C").start();

    }
}

class Account {
    private static int num;
    Lock lock = new ReentrantLock();

    public void count() {
        lock.lock();
        num++;
        System.out.println(Thread.currentThread().getName() + "是当前线程， 获得了" + num);
        lock.unlock();
    }

}
