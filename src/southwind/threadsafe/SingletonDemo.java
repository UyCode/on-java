package southwind.threadsafe;

import javax.xml.crypto.dsig.SignedInfo;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/25/2021 20:32
 */

public class SingletonDemo {

    private volatile static SingletonDemo singletonDemo;
    private int value;

    private SingletonDemo(int value) {
        this.value = value;
        System.out.println("创建了singleton对象");
    }

    public static SingletonDemo getInstance() {
        if( singletonDemo == null) {
            synchronized (SingletonDemo.class) {
                if(singletonDemo == null) {
                    singletonDemo = new SingletonDemo(1);
                }
            }
        }

        return singletonDemo;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
