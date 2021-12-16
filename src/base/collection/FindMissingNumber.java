package base.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 11/3/2021 3:45 PM
 */

public class FindMissingNumber {

    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    static int findMissingNumber(int start, int end, List<Integer> list) {
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if(i == list.get(j)) {
                    count++;
                }
            }
            if(count == 0) {
                return i;
            }
        }
        return 0;
    }

}
