package southwind.collection;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/6 21:26
 */

public class ListDemo {
    public static void main(String[] args) {
        /*Vector vector = new Vector();
        vector.add("hello");
        vector.add("world");
        vector.add(1);
        System.out.println(vector);
        System.out.println("-----------------");
        vector.add(2, "!");
        System.out.println(vector);
        System.out.println("-----------------");
        vector.set(3, "!!");
        System.out.println(vector);*/

        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);

        System.out.println("-----------------");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
