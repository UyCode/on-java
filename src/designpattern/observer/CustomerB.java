package designpattern.observer;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class CustomerB extends Customer{

    @Override
    public void update() {
        System.out.println("客户B的报纸已送达。");
    }
}
