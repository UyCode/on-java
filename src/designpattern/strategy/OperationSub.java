package designpattern.strategy;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class OperationSub implements Operation{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
