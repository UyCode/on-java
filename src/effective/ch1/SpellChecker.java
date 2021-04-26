package effective.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/21/2021 19:50
 */

public class SpellChecker {

    // Inappropriate use of static utility - inflexible & untestable!

    // private static final String dictionary = "";

    private final  String dictionary;

    public SpellChecker(String dictionary) { this.dictionary = Objects.requireNonNull(dictionary); }

    public static boolean isValid(String word) {
        // write code here
        return false;
    }

    public static List<String> suggestions(String typo) {
        // write code here

        return new ArrayList<>();
    }


}
