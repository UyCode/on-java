package jvm.method;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/22/2022 11:02 PM
 */

public class Seller {

    /**
     * 砍价后的价格计算，被编译为invokespecial指令
     * @param original
     * @param customer
     * @return
     */
    public double priceAfterDiscount(double original, Customer customer) {
        if (customer.isVIP()) {
            return original * 0.8d;
        }
        return original;
    }
}
