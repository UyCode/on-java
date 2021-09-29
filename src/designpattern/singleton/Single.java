package designpattern.singleton;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Single {

    /*private static final Single instance = new Single();

    private Single() {
        System.out.println("只创建一个Single对象");
    }

    public static synchronized Single getInstance() {
        return instance;
    }*/

    private static volatile Single instance;

    private Single() {
        System.out.println("只创建一个Single对象");
    }

    public static synchronized Single getInstance() {
        if (null == instance) {
            synchronized(Single.class) {
                if (null == instance) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }


}
