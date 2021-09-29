package designpattern.decorator;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public class Shirt extends ClothesDecorator{

    /**
     * ClothesDecorator
     *
     * @param person
     * @return
     */
    public Shirt(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost() + 1000.0;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("购买了一件衬衫， 累计消费：" + this.cost());
    }


}
