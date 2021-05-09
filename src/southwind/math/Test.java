package southwind.math;

import java.util.Random;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 20:47
 */

public class Test {
    public static void main(String[] args) {
        int frontFace = 0;
        int backFace = 0;
        Random random = new Random();

        boolean currentValue;

        for (int i = 0; i < 100000; i++) {
            currentValue = random.nextBoolean();
            if(Boolean.TRUE.equals(currentValue)) {
                frontFace++;
            } else {
                backFace++;
            }
        }

        System.out.println("出现正面的次数：" + frontFace);
        System.out.println("出现反面的次数：" + backFace);
        System.out.println("正面比率：" + (frontFace/100000.0));
        System.out.println("反面比率：" + (backFace/100000.0));

    }
}
