package southwind.threadsafe;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/25/2021 20:57
 */

public class Test2 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemo singletonDemo = SingletonDemo.getInstance();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemo singletonDemo = SingletonDemo.getInstance();
            }
        }).start();


    }
}
