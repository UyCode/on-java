package algorithm.sort;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/17/2021 8:54 PM
 */
public class QuickSort {

    public void quickSortImpl(int[] array, int low, int high) {
        if (low < high) {
            int currentPivot = partition(array, low, high);

            quickSortImpl(array, low, currentPivot - 1);
            quickSortImpl(array, currentPivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int mark = low -1;

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                mark++;
                swap(array, mark, j);
            }
        }
        swap(array, mark + 1, high);
        return mark + 1;
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
