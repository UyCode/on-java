package southwind.synch;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/24/2021 18:28
 */

public class Test {

    public static void main(String[] args) {

        Account account = new Account();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(account, "线程" + i);
            thread.start();
        }

        /*Account account = new Account();
        Account account1 = new Account();

        Thread thread = new Thread(account, "线程1");
        Thread thread2 = new Thread(account, "线程2");

        thread.start();
        thread2.start();*/
    }
}
