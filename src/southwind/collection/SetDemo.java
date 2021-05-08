package southwind.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/8 22:24
 */

public class SetDemo {
    public static void main(String[] args) {
        /*Set set = new HashSet();
        set.add("Hello");
        set.add("World");
        set.add("Java");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.remove("Java");
        System.out.println("---------------");

        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }*/

        /*LinkedHashSet hashSet = new LinkedHashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Java");
        System.out.println("长度为：" + hashSet.size());
        System.out.println("----------------------");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        LinkedHashSet hashSet1 = new LinkedHashSet<>();
        A a = new A(1);
        A a1 = new A(1);

        hashSet1.add(a);
        hashSet1.add(a1);
        hashSet1.add(1);
        hashSet1.add(1);

        System.out.println(hashSet1);

    }

}
