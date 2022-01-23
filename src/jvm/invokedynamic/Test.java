package jvm.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/23/2022 3:03 PM
 */

public class Test {

    public static void main(String[] args) throws Throwable {
        // 获取方法句柄的不同方式

        // 1.具备Foo类的访问权限
        MethodHandles.Lookup lookup = Foo.lookup();
        Method method = Foo.class.getDeclaredMethod("bar", Object.class);
        MethodHandle methodHandle = lookup.unreflect(method);
        methodHandle.invoke(method);

        // 2.根据类型获取
        MethodType type = MethodType.methodType(void.class, Object.class);
        MethodHandle methodHandle1 = lookup.findStatic(Foo.class, "bar", type);
        methodHandle1.invoke(type);

    }
}
