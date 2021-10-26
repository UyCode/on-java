package base.generic;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 10/26/2021 4:37 PM
 */

public class ArrayUtil {

    /**
     * get the max and min values of array values
     * @param str source elements
     * @return Pair<<code>String>
     */
    public static Pair<String> minmax(String[] str) {
        if (str == null || str.length == 0) {
            return null;
        }

        String min = str[0];
        String max = str[0];

        for (int i = 0; i < str.length; i++) {
            if (min.compareTo(str[i]) > 0) {
                min = str[i];
            }
            if (max.compareTo(str[i]) < 0) {
                max = str[i];
            }
        }
        return new Pair<>(min, max);
    }
}
