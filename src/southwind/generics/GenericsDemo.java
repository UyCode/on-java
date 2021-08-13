package southwind.generics;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 17:45
 */

public class GenericsDemo {
    public static void main(String[] args) {
        Person<Student, Integer> person1 = new Person<>();
        person1.setId(1);
        person1.setUid(1001);
        Student student = new Student();
        student.setId(1);
        person1.setAttr(student);
        Person<Waiter, Integer> person2 = new Person<>();
        person2.setId(2);
        person2.setUid(1002);
        Waiter waiter = new Waiter();
        waiter.setId(1);
        person2.setAttr(waiter);
        System.out.println(person1);
        System.out.println(person2);
    }
}
