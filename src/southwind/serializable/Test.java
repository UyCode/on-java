package southwind.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/16 10:43
 */

public class Test {
    public static void main(String[] args) throws Exception{
        User user = new User(1001,"ahmatjan", 25);
        /*user.setId(1001);
        user.setName("ahmatjan");
        user.setAge(25);*/

        File file = new File("src/southwind/serializable/test.txt");
        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.flush();
        objectOutputStream.close();
        outputStream.flush();
        outputStream.close();


    }
}
