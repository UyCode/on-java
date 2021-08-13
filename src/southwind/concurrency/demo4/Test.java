package southwind.concurrency.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/3/2021 16:41
 */

public class Test {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        // List<String> list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //写入
                list.add("a");
                //读取
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
