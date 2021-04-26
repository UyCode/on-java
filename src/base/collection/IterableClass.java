package base.collection;

import java.security.Key;
import java.util.*;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021 23:03
 */

public class IterableClass {

    public void foreach() {
        /*Object[] list = new Object[10];

        for (Object object : list) {
            System.out.println(object.getClass().getSimpleName());
        }
        
        Collection collection = null;
        for(Iterator iterator = collection.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
*/
        List<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.forEach(System.out::println);
        System.out.println("-------------------------");
        list1.add(1, 4);
        list1.forEach(System.out::println);
        System.out.println("-------------------------");

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);

        stack.forEach(System.out::println);

        System.out.println("-------------------------");

        stack.pop();
        stack.forEach(System.out::println);

        System.out.println("-------------------------");
        int polled = stack.pop();
        System.out.println(polled);
        stack.forEach(System.out::println);

        System.out.println("-------------------------");

        stack.pop();
        stack.pop();

        if(stack.isEmpty()) {
            System.out.println("stack is empty");
        }

        System.out.println("-------------------------");

        HashSet<String> set = new HashSet<>();

        // ascii 49
        set.add("1");
        // ascii 50
        set.add("2");
        // ascii 51
        set.add("3");
        set.forEach(System.out::println);

        System.out.println("-------------------------");

        // hashcode = 49 + 50 + 51
        Integer hashCode = set.hashCode();
        System.out.println(hashCode);


        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(49, "1");
        hashMap.put(50, "2");
        hashMap.put(51, "3");
        System.out.println("-------------------------");
        hashMap.forEach((key, value) -> System.out.println(key + ":" +value));
        int hashCode1 = hashMap.hashCode();
        System.out.println("-------------------------");
        System.out.println(hashCode1);


    }
}
