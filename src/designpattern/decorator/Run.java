package designpattern.decorator;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Run {

    public static void main(String[] args) {
        Person ahmatjan = new Ahmatjan();

        ahmatjan = new Shirt(ahmatjan);

        ahmatjan = new Trousers(ahmatjan);

        ahmatjan.show();

        System.out.println("一共消费：" + ahmatjan.cost());
    }
}
