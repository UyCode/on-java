package algorithm.sort;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/17/2021 7:32 PM
 */

public class SelectionSort {

    public void selectionSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len -1; i++) {
            for (int j = i + 1; j <len; j++) {
                if (array[j] < array[i]) {
                    //swap the item
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
