package southwind.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/12 23:05
 */

public class InputStreamDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("src/southwind/io/test.txt");
        InputStream inputStream = new FileInputStream(file);

        //处理流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        char[] chars = new char[1024];
        int read = inputStreamReader.read(chars);

        String result = new String(chars, 0, read);

        inputStreamReader.close();
        System.out.println(result);
    }
}
