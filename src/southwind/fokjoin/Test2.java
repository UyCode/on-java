package southwind.fokjoin;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/5 19:44
 */

public class Test2 {
    public static void main(String[] args) {
        Long sum = 0L;
        Long start = System.currentTimeMillis();
        for (Long i = 0L; i <= 10_0000_0000L; i++) {
            sum += i;
        }
        Long end = System.currentTimeMillis();
        System.out.println(sum + "," + (end - start));
        // System.out.println(findSum("2132396234239642397462342334534534534534534534534534543453454234234234234324234", "87438753453453453453453453453453454353453453453453453453453948758347538475839745983475348975938475983475983745983745983745983479857349857398475"));
    }

    public static String findSum(String str1, String str2) {
        // Before proceeding further, make sure length
        // of str2 is larger.
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = str1.length(), n2 = str2.length();

        // Reverse both of Strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int) (str1.charAt(i) - '0') +
                    (int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++) {
            int sum = ((int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0) {
            str += (char) (carry + '0');
        }

        // reverse resultant String
        String regex = "(.{3})";
        str = str.replaceAll(regex, "$1,");
        str = new StringBuilder(str).reverse().toString();
        String temp = new StringBuilder(str).reverse().toString();

        return str;
    }
}
