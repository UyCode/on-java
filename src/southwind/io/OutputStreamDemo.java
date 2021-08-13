package southwind.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/12 20:51
 */

public class OutputStreamDemo {
    public static void main(String[] args) throws Exception{

        OutputStream outputStream = new FileOutputStream("src/southwind/io/test1.txt");
        byte[] bytes = {105, 67, 100, 98, 88};
        outputStream.write(bytes);


        // 处理流
        String string = "你好，世界！";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(string);

        outputStreamWriter.flush();
        outputStreamWriter.close();
        outputStream.flush();
        outputStream.close();

    }
}
