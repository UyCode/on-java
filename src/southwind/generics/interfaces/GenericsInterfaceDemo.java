package southwind.generics.interfaces;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 19:06
 */

public interface GenericsInterfaceDemo<T> {

    /**
     * 获取数据
     * @return
     */
    public T getValue();

    /**
     * 赋值数据
     * @param t
     */
    public void setValue(T t);
}
