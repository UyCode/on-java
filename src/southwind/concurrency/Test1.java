package southwind.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/29/2021 00:00
 */

public class Test1 {
    public static void main(String[] args) {
        Account account = new Account();
        new Thread(()->{
            account.count1();}).start();
        new Thread(()->{
            account.count2();}).start();
    }
}

class Account{
    private static int num;

    public synchronized void count1() {
        num++;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前函数输出1");
    }
    public synchronized void count2() {
        num++;
        System.out.println("当前函数输出2");
    }
}