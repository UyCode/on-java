package southwind.io;

import java.io.*;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/12 23:47
 */

public class BufferedStreamDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("src/southwind/io/test.txt");
        InputStream inputStream = new FileInputStream(file);
        Reader reader = new FileReader(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }


        byte[] bytes = new byte[1024];
        int length = bufferedInputStream.read(bytes);


        for (byte aByte : bytes) {
            System.out.print(aByte);
        }
        bufferedInputStream.close();
        inputStream.close();
        reader.close();
        bufferedReader.close();
    }
}
