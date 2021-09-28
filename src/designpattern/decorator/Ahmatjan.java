package designpattern.decorator;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Ahmatjan implements Person{

    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("没穿衣服");
    }
}
