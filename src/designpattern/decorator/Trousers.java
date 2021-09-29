package designpattern.decorator;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Trousers extends ClothesDecorator{

    public Trousers(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost() + 800;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("购买了一条裤子，累计花费：" + this.cost());
    }
}
