package southwind.synch;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/24/2021 19:41
 */

public class SynchronizedTest3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable target = () -> {
                SynchronizedTest3 test3 = new SynchronizedTest3();
                test3.test();
            };
            Thread thread = new Thread(target);
            thread.start();
        }
    }

    public void test() {

        // 这里必须说明要同步的类
        synchronized (SynchronizedTest3.class) {
            System.out.println("开始测试方法.....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("测试结束....");
        }
        }

}
