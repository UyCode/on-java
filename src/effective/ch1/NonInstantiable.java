package effective.ch1;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/21/2021 19:45
 */

public class NonInstantiable {


    //Suppress default constructor for non-instantiable

    private NonInstantiable() {
        throw new AssertionError();
    }

}
