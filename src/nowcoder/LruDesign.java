package nowcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 10/4/2021
 */

public class LruDesign {

    public static void main(String[] args) {
        int[][] operation = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        LRU(operation, 3);
    }

    public static int[][] LRU(int[][] operation, int k) {

        int len = operation.length;
        Map<Integer, Integer> sets = new HashMap<>();

        for (int i = 0; i < len; i++){
            int opt = operation[i][0];
            if (1 == opt) {
                sets.put(operation[i][1], operation[i][2]);
            }
        }

        return null;
    }
}
