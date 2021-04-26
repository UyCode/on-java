package base.same;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/5/2021 23:56
 */

public class ArrayInit {


    /**
     * 或者, 这个是c的初始化一样.
     * int array[];
     */
    int[] arr;

    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }



}
