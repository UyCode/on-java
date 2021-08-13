package southwind.juc.demo1;

import java.util.concurrent.CountDownLatch;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/3/2021 17:18
 */

public class CountDownLatchDemo {
    public static void main(String[] args) {
        //创建计数器
        CountDownLatch latch = new CountDownLatch(100);
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("----------Thread");
                latch.countDown();
            }
        }).start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Main----------");
        }

    }
}
