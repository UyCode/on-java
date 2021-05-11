package southwind.io;

import java.io.File;
import java.io.IOException;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/11 23:26
 */

public class IoDemo {
    public static void main(String[] args) {
        File file1 = new File("src/southwind/io/test1.txt");
        File file = new File("src/southwind/io/test.txt");
        System.out.println(file.exists());
        try {
            file1.createNewFile();
            if(file1.exists()) {
                System.out.println("文件已存在");
            } else {
                file1.renameTo(new File("src/southwind/io/test2.txt"));
            }
            System.out.println(file1.getPath());
            //System.out.println(file1.delete());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
