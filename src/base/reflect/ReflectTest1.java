package base.reflect;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 11/2/2021
 */

public class ReflectTest1 {
    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }


    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (null != cls.getPackage()) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }

        System.out.println("Interface: " + cls.isInterface());
        System.out.println("Enum: " + cls.isEnum());
        System.out.println("Array: " + cls.isArray());
        System.out.println("Primitive: " +  cls.isPrimitive());

        System.out.println("-------------------------");
    }
}
