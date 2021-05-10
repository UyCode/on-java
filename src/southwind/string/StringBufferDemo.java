package southwind.string;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/10 23:50
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer("Hello");
        StringBuffer stringBuilder1 = new StringBuffer();
        stringBuilder1.append("Hello");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder1.length());


    }

}
