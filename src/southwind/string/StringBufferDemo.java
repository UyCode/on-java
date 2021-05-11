package southwind.string;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/10 23:50
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append("Hello");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer1.length());
        System.out.println(stringBuffer1.charAt(3));




    }

}
