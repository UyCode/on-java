package designpattern.template;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public abstract class Cook {
    public void open() {
        System.out.println("打开抽油烟机");
    }

    public void fire() {
        System.out.println("生火");
    }

    /**
     * doCook 子类实现具体方法
     * @return void
     */
    public abstract void doCook();

    public void offFire() {
        System.out.println("关火");
    }

    public void close() {
        System.out.println("关闭抽油烟机");
    }

    public final void cook() {
        this.open();
        this.fire();
        this.doCook();
        this.offFire();
        this.close();
    }
}
