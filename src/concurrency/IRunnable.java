package concurrency;

import java.util.Date;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/26/2022
 */

public class IRunnable implements Runnable{

    private String name;

    public IRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start at: " + new Date());
        process();
        System.out.println(Thread.currentThread().getName() + " end at: " + new Date());

    }

    private void process() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
