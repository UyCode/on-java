package southwind.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 0:59
 */

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, A> map = new HashMap<>();
        map.put(1, new A(1));
        map.put(2, new A(2));
        map.put(3, new A(1));
        map.put(4, new A(2));
        map.put(5, new A(3));
        map.put(6, new A(4));

        System.out.println(map);
        map.remove(3);
        System.out.println(map);
        map.put(4, new A(5));
        System.out.println(map);

        Set<Integer> set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collection<A> collection = map.values();
        for(Object o : collection) {
            System.out.println(o);
        }

        // 这里必须再次将set的值重新赋值给迭代器，因为每次iterator.next() 会把Iterator里面的元素移除。
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            A value = (A) map.get(key);
            System.out.println(key + "--" + value);
        }

    }
}
