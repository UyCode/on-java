package base.same;

import java.util.Arrays;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/5/2021 16:25
 */

public class Solution {

    public static int purchasePlans(int[] nums, int target) {

        nums = Arrays.stream(nums).filter(num -> num < target).toArray();
        int len = nums.length;
        int count = 0;

        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {

                if( nums[i] + nums[j] <= target) {
                    count++;
                }
            }
        }
        return count % 1000000007;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,11,9};


        System.out.println(purchasePlans(arr, 10));
    }

    void method() {}
}
