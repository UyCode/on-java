package southwind.threadsafe;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/25/2021 20:33
 */

public class Test {

    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        System.out.println(singletonDemo.getValue());
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        System.out.println(singletonDemo2.getValue());
        singletonDemo2.setValue(2);
        SingletonDemo singletonDemo3 = SingletonDemo.getInstance();
        System.out.println(singletonDemo3.getValue());
    }
}
