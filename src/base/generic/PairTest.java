package base.generic;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 10/26/2021 4:35 PM
 */

public class PairTest {

    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> sorted = ArrayUtil.minmax(words);
        System.out.println(sorted.getFirst());
        System.out.println(sorted.getSecond());
    }
}
