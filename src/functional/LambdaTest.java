package functional;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/28/2021
 */

public class LambdaTest {

    public static void main(String[] args) {

        Statement statement = null;
        // 匿名内部实现
        statement = new Statement() {
            @Override
            public void testStatement() {
                System.out.println("Test Statement With inner class");
            }
        };
        statement.testStatement();

        statement = () -> {
            System.out.println("Lambda λ express");
        };
        statement.testStatement();

    }
}
