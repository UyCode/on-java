package southwind.juc.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 5/4/2021 10:52
 */

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        Cache cache = new Cache();
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.write(temp, String.valueOf(temp));
            }).start();
        }

        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.read(temp);
            }).start();
        }
    }
}

class Cache {
    private Map<Integer, String> map = new HashMap<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    /**
     * 写入
     */
    public void write(Integer key, String value) {
        lock.writeLock().lock();
        System.out.println(key + "开始写入");
        map.put(key, value);
        System.out.println(key + "写入完毕");
        lock.writeLock().unlock();
    }

    /**
     * 读取
     */
    public void read(Integer key) {
        lock.readLock().lock();
        System.out.println(key + "开始读取");
        map.get(key);
        System.out.println(key + "读取完毕");
        lock.readLock().unlock();
    }
}
