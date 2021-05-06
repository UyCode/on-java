package southwind.collection;

import java.util.PriorityQueue;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/6 23:48
 */

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue<>();
        /*priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);*/
        System.out.println(priorityQueue);
        System.out.println("-------------");
        priorityQueue.add(new A(2));
        priorityQueue.add(new A(1));
        System.out.println(priorityQueue);
    }
}
class A implements Comparable{
    private int num;
    public A(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {
        A a = (A)o;
        if(this.num > a.num) {
            return 1;
        } else if(this.num == a.num) {
            return 0;
        } else {
            return -1;
        }
    }
}
