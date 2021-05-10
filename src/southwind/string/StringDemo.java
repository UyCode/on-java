package southwind.string;

import java.util.Locale;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 21:15
 */

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "hello world,this is,Java,course";
        String str2 = "您好,欢迎来到java的世界";
        System.out.println(str2.compareTo(str1));

        System.out.println(str1.startsWith("hello world"));
        System.out.println(str1.indexOf("w"));
        System.out.println(str1.indexOf("h", 2));
        System.out.println(str1.substring(6, 11));
        System.out.println(str1.substring(6));
        System.out.println(str1.substring(6, str1.length()));
        System.out.println(str1.concat("."));
        //System.out.println(str1.replaceAll(str1,"this is new String"));
        String[] split = str1.split(",");
        for (String item: split
             ) {
            System.out.println(item);
        }

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        char[] chars = str2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] +" ");
        }





    }
}
