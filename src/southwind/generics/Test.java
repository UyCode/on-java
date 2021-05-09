package southwind.generics;

import java.time.Period;
import java.util.ArrayList;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 18:29
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        test(list1);
        test(list2);

        // Long是test1中定义的Number的子类，这里可以是Number本身
        Person<Student, Long> person = new Person<>();
        Student student = new Student();
        student.setId(1);
        person.setId(1);
        person.setUid(1001L);
        person.setAttr(student);
        test1(person);

        // Object是test2中定义的String的父类，这里可以是String本身
        Person<Waiter, Object> person1 = new Person<>();
        Waiter waiter = new Waiter();
        waiter.setId(1);
        person1.setId(2);
        person1.setUid("1002");
        person1.setAttr(waiter);
        test2(person1);


    }

    /**
     * 泛型通配符
     * @param list
     */
    public static void test(ArrayList<?> list) {
        System.out.println(list);

    }


    /**
     * 泛型上限
     * @param person
     */
    public static void test1(Person<Student, ? extends Number> person) {
        System.out.println(person);

    }

    /**
     * 泛型下限
     * @param person
     */
    public static void test2(Person<Waiter, ? super String> person) {
        System.out.println(person);

    }
}
