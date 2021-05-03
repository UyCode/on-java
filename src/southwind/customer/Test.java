package southwind.customer;


/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 20:50
 */

public class Test {
    public static void main(String[] args) {
        Container container = new Container();
        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);

        new Thread(() -> {producer.product();}, "生产者A").start();
        new Thread(() -> {consumer.consume();}, "消费者A").start();
        new Thread(() -> {producer.product();}, "生产者B").start();
        new Thread(() -> {consumer.consume();}, "消费者B").start();
    }
}
