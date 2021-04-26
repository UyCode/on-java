package southwind.synch;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/24/2021 19:30
 */

public class SynchronizedTest2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable target = new Runnable() {
                @Override
                public void run() {
                    SynchronizedTest2 test2 = new SynchronizedTest2();
                    test2.test();
                }
            };
            Thread thread = new Thread(target);
            thread.start();
        }
    }

    public synchronized void test() {
        System.out.println("开始测试方法.....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("测试结束....");
    }
}
