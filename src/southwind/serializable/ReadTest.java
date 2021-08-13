package southwind.serializable;

import java.io.*;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/16 10:58
 */

public class ReadTest {
    public static void main(String[] args) throws Exception{
        File file = new File("src/southwind/serializable/test.txt");
        InputStream inputStream = new FileInputStream(file);

       ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

       User user = (User) objectInputStream.readObject();
        System.out.println(user);
        objectInputStream.close();
        inputStream.close();
    }
}
