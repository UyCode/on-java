package base.statics;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021 22:48
 */

public class OuterClass {

    private String name;
    private int age;

    class InnerClass {
        public InnerClass() {
            name = "ahmatjan";
            age = 25;
        }
    }
}
