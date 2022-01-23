package jvm.invokedynamic;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/23/2022 3:02 PM
 */

public class Foo {
    private static void bar(Object o) {
        System.out.println("method bar invoked, param: " + o);
    }

    public static Lookup lookup() {
        return MethodHandles.lookup();
    }
}
