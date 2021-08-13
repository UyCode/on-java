package southwind.threadsafe.volatiledemo;

import java.util.concurrent.TimeUnit;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/5 21:14
 */

public class Test {

    private static int num = 0;

    public static void main(String[] args) {
        /**
         * 循环
         */
        new Thread(() -> {
            while(num == 0) {
                System.out.println("一些任务执行了，执行完后拿最新值");
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num = 1;
        System.out.println(num);
    }
}
