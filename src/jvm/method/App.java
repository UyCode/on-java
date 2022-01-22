package jvm.method;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/22/2022 11:01 PM
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        invoke(null,1);

        BadSeller badSeller = new BadSeller();
        badSeller.priceAfterDiscount(100, null);
    }

    /**
     * invoke
     * @param obj
     * @param args
     */
    static void invoke(Object obj, Object... args) {
        // TODO
        System.out.println(obj + " : " + args);
    }

    /**
     * invoke another method
     * @param s
     * @param obj
     * @param args
     */
    static void invoke(String s, Object obj, Object... args) {
        // TODO
        System.out.println(s + " : " + obj + " : " + args);
    }

}
