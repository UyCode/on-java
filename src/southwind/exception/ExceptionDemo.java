package southwind.exception;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/11 23:43
 */

public class ExceptionDemo extends Exception{

    public ExceptionDemo(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (ExceptionDemo exceptionDemo) {
            exceptionDemo.printStackTrace();
        }
    }

    public static void test() throws ExceptionDemo {

    }
}
