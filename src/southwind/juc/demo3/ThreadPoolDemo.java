package southwind.juc.demo3;

import org.xml.sax.helpers.DefaultHandler;

import java.util.concurrent.*;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/4/2021 11:18
 */

public class ThreadPoolDemo {
    public static void main(String[] args) {
        /**
         * 不推荐这3种方式创建线程
         */

        //单例线程对象
        //ExecutorService service = Executors.newSingleThreadExecutor();

        //指定线程数量
        //ExecutorService service = Executors.newFixedThreadPool(5);

        //缓存线程池
        //ExecutorService service = Executors.newCachedThreadPool();


       ExecutorService service = null;
       try{
           /**
            * 手写参数
            */
           service = new ThreadPoolExecutor(
                   2,
                   3,
                   1L,
                   TimeUnit.SECONDS,
                   new ArrayBlockingQueue<>(2),
                   Executors.defaultThreadFactory(),
                   new ThreadPoolExecutor.DiscardOldestPolicy()
           );
       } catch (Exception e) {
           e.printStackTrace();
       }

        for (int i = 0; i < 6; i++) {
            final int temp = i;
            service.execute(() -> {
//                try {
//                    TimeUnit.MILLISECONDS.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + "---"+temp + "办理业务");
            });
        }

        service.shutdown();
    }
}
