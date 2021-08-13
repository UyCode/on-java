package southwind.juc.demo1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/4/2021 10:36
 */

public class SemaphoreDemo {
    public static void main(String[] args) {
        // 初始化，最多可以有5个线程同时访问资源
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 15; i++) {
            new Thread(() -> {
                //获取许可
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "获取了许可");
                    TimeUnit.MILLISECONDS.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "完成了操作");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //释放资源
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
