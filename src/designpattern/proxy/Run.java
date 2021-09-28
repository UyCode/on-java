package designpattern.proxy;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class Run {

    public static void main(String[] args) {
        HouseFinder houseFinder = new User();
        HouseProxy proxy = new HouseProxy(houseFinder);
        proxy.findHouse();

    }
}
