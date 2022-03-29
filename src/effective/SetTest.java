package effective;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2022/3/29 22:52
 */

public class SetTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        int i = -1;
        while (i != 0) {
            i = scanner.nextInt();
            set.add(i);
        }
        System.out.println(set);

    }
}
