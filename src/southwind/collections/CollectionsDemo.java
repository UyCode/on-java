package southwind.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 15:52
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("!");
        System.out.println(arrayList);

        System.out.println("----------------------");

        boolean isAdded = Collections.addAll(arrayList, "1", "2","2","2","2");
        System.out.println(arrayList+ "   is add new element?: " +isAdded + "   size is: " + arrayList.size());

        System.out.println("----------------------");

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        System.out.println("----------------------");

        Collections.swap(arrayList, 1,2);
        System.out.println(arrayList);

        System.out.println("----------------------");

        Collections.sort(arrayList);
        System.out.println(arrayList);

        //集合中的元素必须升序排序(如果集合已经是升序排序，那么不需调用sort方法，否则首先要调用Collections的sort方法进行排序。
        int index = Collections.binarySearch(arrayList, "2");
        System.out.println("----------------------");
        System.out.println(arrayList.get(index) + "的下标为：" +index);


        System.out.println("----------------------");
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("Hello");
        hashSet.add("2");
        hashSet.add("World");

        System.out.println(hashSet);
        Collections.addAll(hashSet, "Java");
        System.out.println("-------------------");
        System.out.println(hashSet);

    }


}
