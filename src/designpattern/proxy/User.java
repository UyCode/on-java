package designpattern.proxy;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class User implements HouseFinder{

    @Override
    public void findHouse() {
        System.out.println("找房子");
    }
}
