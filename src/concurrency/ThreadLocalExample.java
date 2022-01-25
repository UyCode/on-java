package concurrency;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/25/2022
 */

public class ThreadLocalExample implements Runnable{
    private static final ThreadLocal<SimpleDateFormat> formatters =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyMMdd HHmm"));

    public static void main(String[] args) throws Exception{
        ThreadLocalExample example  = new ThreadLocalExample();
        for (int i = 0; i <10; i++) {
            Thread thread = new Thread(example, "" + i);
            Thread.sleep(new Random().nextInt(1000));
            thread.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " default formatter: " + formatters.get().toPattern());

        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        formatters.set(new SimpleDateFormat());
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " formatter: " + formatters.get().toPattern());


    }

}
