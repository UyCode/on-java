package designpattern.strategy;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int num1, int num2) {
        return this.operation.doOperation(num1, num2);
    }

}
