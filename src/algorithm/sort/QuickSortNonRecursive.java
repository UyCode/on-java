package algorithm.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/20/2021 12:50 PM
 */

public class QuickSortNonRecursive {

    private String LOW = "low";
    private String HIGH = "high";

    public void quickSort(int[] array, int low, int high) {
        // 用集合栈来代替递归的函数
        Stack<HashMap<String, Integer>> sortStack = new Stack<>();

        // 整个数组的起止下标， 以哈希的形式入栈
        HashMap<String, Integer> rootParams = new HashMap<>(2);
        rootParams.put(LOW, low);
        rootParams.put(HIGH, high);

        sortStack.push(rootParams);

        while (!sortStack.isEmpty()) {
            // 栈顶元素出栈，得到起止下标。
            HashMap<String, Integer> params = sortStack.pop();

            // 得到基准元素的位置
            int pivotIndex = partition(array, params.get(LOW), params.get(HIGH));

            // 根据基准元素分两个部分， 把每个部分的起止下标入栈
            if (params.get(LOW) < pivotIndex - 1) {
                HashMap<String, Integer> leftParams = new HashMap<>(2);
                leftParams.put(LOW, params.get(LOW));
                leftParams.put(HIGH, pivotIndex - 1);
                sortStack.push(leftParams);

            }

            if (pivotIndex + 1 < params.get(HIGH)) {
                HashMap<String, Integer> rightParams = new HashMap<>(2);
                rightParams.put(LOW, pivotIndex + 1);
                rightParams.put(HIGH, params.get(HIGH));
                sortStack.push(rightParams);
            }
        }

    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low -1;

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
