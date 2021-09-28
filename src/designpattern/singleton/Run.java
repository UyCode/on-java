package designpattern.singleton;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Run {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            //Single.getInstance();

            // use multi-thread mode, then it will create many instance unless use synchronized.
            new Thread(() -> {
                Single.getInstance();
            }).start();
        }
    }
}
