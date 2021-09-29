package designpattern.decorator;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021
 */

public abstract class ClothesDecorator implements Person{
    protected Person person;

    /**
     * ClothesDecorator
     * @param person
     * @return
     */
    public ClothesDecorator(Person person) {
        this.person = person;
    }
}
