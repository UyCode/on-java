package southwind.generics.interfaces;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 19:09
 */

public class GenericsInterfaceImpl<T> implements GenericsInterfaceDemo<T>{

    private T data;

    @Override
    public T getValue() {
        return this.data;
    }

    @Override
    public void setValue(T t) {
        this.data = t;
    }
}
