package jvm.exception;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/23/2022 1:56 AM
 */


public class Foo {
    private static int tryBlock;
    private static int catchBlock;
    private static int finallyBlock;
    private static int methodExit;


    public static void test() {
        try {
            tryBlock = 0;
        } catch (Exception e) {
            catchBlock = 1;
        } finally {
            finallyBlock = 2;
        }
        methodExit = 3;
    }
    /*
    $ javap -c Foo
        ...
public void test();
        Code:
        0: aload_0
        1: iconst_0
        2: putfield      #20                 // Field tryBlock:I
        5: goto          30
        8: astore_1
        9: aload_0
        10: iconst_1
        11: putfield      #22                 // Field catchBlock:I
        14: aload_0
        15: iconst_2
        16: putfield      #24                 // Field finallyBlock:I
        19: goto          35
        22: astore_2
        23: aload_0
        24: iconst_2
        25: putfield      #24                 // Field finallyBlock:I
        28: aload_2
        29: athrow
        30: aload_0
        31: iconst_2
        32: putfield      #24                 // Field finallyBlock:I
        35: aload_0
        36: iconst_3
        37: putfield      #26                 // Field methodExit:I
        40: return
        Exception table:
        from    to  target type
        0     5     8   Class java/lang/Exception
        0    14    22   any

        ...
     */
}
