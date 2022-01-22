package jvm.method;

import java.util.Random;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/22/2022 11:02 PM
 */

public class BadSeller extends Seller {

    @Override
    public double priceAfterDiscount(double original, Customer customer) {
        if (customer.isVIP()) {
            return original * beggarVip();
        } else {
            return super.priceAfterDiscount(original, customer);
        }
    }

    /**
     * 这个会被编译为invokespecial指令，因为使用了Random类的构造器
     * 我们会调用 Random 类的构造器。该调用会被编译为 invokespecial 指令。
     * 然后我们会以这个新建的 Random 对象为调用者，调用 Random 类中的 nextDouble 方法。
     * 该调用会被编译为 invokevirtual 指令。
     */
    public static double beggarVip() {
        Random rand = new Random();
        double price = rand.nextDouble();
        return price + 0.8d;
    }

}
