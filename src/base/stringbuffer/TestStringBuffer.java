package base.stringbuffer;


import java.util.ArrayList;
import java.util.Hashtable;

public class TestStringBuffer {

    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("A");

        StringBuffer b = new StringBuffer("B");

        mb_operate(a, b);

        System.out.println(a + "." + b);
        
        int x = 0;
        int y = 5;
        System.out.println(x + ": " + y);


    }

    static void mb_operate(StringBuffer x, StringBuffer y) {

        x.append(y);

        y = x;

    }
}
