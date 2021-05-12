package southwind.io;

import java.io.*;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/12 23:32
 */

public class Test {
    public static void main(String[] args)  throws Exception{
        File file = null;

        //节点流
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(file);

        Reader reader = new FileReader(file);
        Writer writer = new FileWriter(file);

        //处理流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);


    }
}
