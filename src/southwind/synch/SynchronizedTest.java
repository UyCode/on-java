package southwind.synch;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/24/2021 19:14
 */

public class SynchronizedTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable target = SynchronizedTest::test;
            Thread thread = new Thread(target);
            thread.start();
        }
    }

    public synchronized static void test() {
        System.out.println("开始测试方法.....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("测试结束....");
    }
}
