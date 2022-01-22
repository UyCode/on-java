package algorithm;

import algorithm.sort.QuickSort;
import org.apache.lucene.util.RamUsageEstimator;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 9/17/2021 10:03 PM
 */
public class MainTester {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        long begin = System.currentTimeMillis();

        System.out.println("begin sorting... " + array[array.length - 1]);

        // sort algorithm here

        QuickSort quickSort = new QuickSort();
        quickSort.quickSortImpl(array, 0, array.length-1);
        /*QuickSortNonRecursive quickSort = new QuickSortNonRecursive();
        quickSort.quickSort(array, 0, array.length - 1);*/
        System.out.println("Use " + (System.currentTimeMillis() - begin) + " MilliSeconds!");

        long ramUsage = RamUsageEstimator.shallowSizeOf(quickSort);
        System.out.println("Use " + ramUsage + "KB ram");
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
