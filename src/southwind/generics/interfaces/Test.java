package southwind.generics.interfaces;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 19:08
 */

public class Test {
    public static void main(String[] args) {
        GenericsInterfaceDemo<String> demo = new GenericsInterfaceImpl<>();
        demo.setValue("接口实现1");
        String value = demo.getValue();
        System.out.println(value);

        GenericsInterfaceDemo demo1 = new GenericsInterfaceImpl2();

        demo1.setValue("接口实现2");
        Object value1 = demo1.getValue();
        System.out.println(value1);

    }
}
