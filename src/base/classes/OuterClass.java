package base.classes;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 12/16/2021 4:03 PM
 */

public class OuterClass {


    private int oUTA = 1;
    private static final int STATIC_B = 2;

    public void testFunction() {
        int iNNERC = 3;
        class Inner {
            private void func() {
                System.out.println(oUTA);
                System.out.println(STATIC_B);
                System.out.println(iNNERC);
            }
        }
        Inner inner = new Inner();
        inner.func();
    }

    public static void testStaticFunction() {
        int d = 3;
        class Inner {
            private void func() {
                System.out.println(STATIC_B);
                System.out.println(d);
            }
        }
        Inner inner = new Inner();
        inner.func();
    }

    public static void main(String[] args) {
        testStaticFunction();
        OuterClass outerClass = new OuterClass();
        outerClass.testFunction();
    }
}
