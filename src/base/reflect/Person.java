package base.reflect;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/8/2021 00:30
 */

public class Person {

    public String name;
    public int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
         this.age = age;
    }

    @Override
    public String toString() {

        return "name = " + name + ", age = " + age;
    }
}
