package southwind.io;

import java.io.*;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/12 0:03
 */

public class StreamDemo {

    public static void main(String[] args) {
        File file = new File("src/southwind/io/test.txt");
        if (file.exists()) {
            byte[] bytes = new byte[(int)file.length()];
            try {
                InputStream inputStream = new FileInputStream(file);
                int lengths = inputStream.read(bytes);
                while (inputStream.available() > 0) {
                    System.out.println(inputStream.read());
                }
                System.out.println(lengths);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
