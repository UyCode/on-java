package base.statics;

/**
 * @author Hyper
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021/10:27:08
 */

public abstract class SmallDog implements Dog {

    @Override
    public void callDog() {
        System.out.println("this is dog call from abstract class");
    }

    /**
     * get the dog's size
     */
    public abstract void dogSize();

}
