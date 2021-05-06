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
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
    }
}
