package southwind.customer;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 20:37
 */

public class Container {
    public Hamburger[] hamburgers = new Hamburger[10];
    public int index = 0;

    /**
     * 向容器添加汉堡
     */

    public synchronized void push(Hamburger hamburger) {
        while(index == hamburgers.length) {
            try {
                // 等待生产
                // 让正在访问当前资源的线程等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 唤醒之前等待的线程
        this.notify();
        hamburgers[index] = hamburger;
        index++;
        System.out.println(Thread.currentThread().getName()+"生产一个汉堡类" + hamburger);
    }

    public synchronized Hamburger pop() {
        while(index == 0){
            // 等待生产
            // 让正在访问当前资源的线程等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 唤醒之前等待的线程
        this.notify();
        index--;
        System.out.println(Thread.currentThread().getName()+"消费了一个汉堡类" + hamburgers[index]);
        return hamburgers[index];
    }
}
