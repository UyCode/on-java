package designpattern.observer;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Run {

    public static void main(String[] args) {
        NewspaperPress press = new NewspaperPress();
        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();
        press.addCustomer(customerA);
        press.addCustomer(customerB);
        press.newspaper();
    }
}
