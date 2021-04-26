package base.reflect;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/8/2021 00:33
 */

public class Student extends Person implements Study{

    private String className;
    private String address;

    public Student() {
        super();
    }

    public Student(String name, int age, String className, String address) {
        super(name, age);
        this.className = className;
        this.address = address;
    }

    public Student(String className) {
        this.className = className;
    }

    @Override
    public String toString() {

        return "name = " + name + ", age = " + age + ", className = "
                + className + ", address = " + address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
