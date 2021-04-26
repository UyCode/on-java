package base.same;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/5/2021 23:32
 */

public class LifeCycle {

    /**
     * 静态属性
     */
    private static String staticField = getStaticField();

    // 静态方法块
    static {
        System.out.println(staticField);
        System.out.println("静态方法块初始化");
    }

    /**
     * 普通属性
     */
    private String commonFiled = getCommonFiled();

    // 普通方法块
    {
        System.out.println(commonFiled);
    }

    /**
     * 构造函数
     */
    public LifeCycle() {
        System.out.println("构造函数初始化");
    }

    public static String getStaticField() {
        String staticField = "Static Filed init...";
        return staticField;
    }

    public static String getCommonFiled() {
        String commonFiled = "Common Filed init...";
        return commonFiled;
    }


}
