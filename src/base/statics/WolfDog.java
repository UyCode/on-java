package base.statics;

import base.statics.SmallDog;

/**
 * @author Hyper
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021/10:30:13
 */

public class WolfDog extends SmallDog implements Dog {

    @Override
    public void callDog() {
        System.out.println("this is dog call from wolfDog");
    }

    @Override
    public void getDogColor() {
        System.out.println("this is a black dog");
    }

    @Override
    public void dogSize() {
        System.out.println("this is small dog from wolfDog");
    }
}
