package southwind.generics.interfaces;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 19:21
 */

public class GenericsInterfaceImpl2 implements GenericsInterfaceDemo<String>{

    private String id;

    @Override
    public String getValue() {
        return this.id;
    }

    @Override
    public void setValue(String id) {
        this.id = id;
    }
}
