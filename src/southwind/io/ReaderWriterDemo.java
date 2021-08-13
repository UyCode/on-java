package southwind.io;

import java.io.*;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/12 21:09
 */

public class ReaderWriterDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("src/southwind/io/test3.txt");
        /*
        Reader reader = new FileReader(file);

        char[] chars = new char[5];
        int len = reader.read(chars, 2,3);
        System.out.println(len);

        for (char aChar : chars) {
            System.out.println(aChar);
        }

        reader.close();
        */


        Writer writer = new FileWriter(file);
        char[] chars1 = {'这', '是','测','试','了'};
        writer.write(chars1);
        writer.append(" hello world");
        writer.flush();
        writer.close();

    }
}
