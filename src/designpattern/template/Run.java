package designpattern.template;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/21/2021
 */

public class Run {

    public static void main(String[] args) {
        Cook cooks = new CookTomato();
        cooks.cook();

        System.out.println("***************************************");

        cooks = new CookPotato();
        cooks.cook();


    }
}
