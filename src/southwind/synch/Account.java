package southwind.synch;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/24/2021 18:25
 */

public class Account implements Runnable{

    private static int num;


    @Override
    public synchronized void run() {
        num++;
        System.out.println(Thread.currentThread().getName() + " 是当前的第" + num +"位访问");

    }

}
