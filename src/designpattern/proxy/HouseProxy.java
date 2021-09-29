package designpattern.proxy;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class HouseProxy implements HouseFinder{

    private HouseFinder houseFinder;

    public HouseProxy(HouseFinder houseFinder) {
        this.houseFinder = houseFinder;
    }

    @Override
    public void findHouse() {

        System.out.println("日志：找了个代理");

        this.houseFinder.findHouse();
    }
}
