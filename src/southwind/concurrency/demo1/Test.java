package southwind.concurrency.demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/28/2021 20:56
 */

public class Test {
    public static void main(String[] args) {
        MyCallable callable = new MyCallable();
        FutureTask<String> task = new FutureTask<>(callable);
        Thread thread = new Thread(task);
        thread.start();

        try {
            System.out.println(task.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        Thread thread1 = new Thread(task);
        thread1.start();


    }
}
 class MyCallable implements Callable<String> {

     @Override
     public String call() throws Exception {
         System.out.println("Hello Callable");
         return "complete";
     }
 }