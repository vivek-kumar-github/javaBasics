import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int n = 99;
        System.out.println(count(n));
    }

    public static int count(int n) {
        if (n < 1) return 0;
        int unique = countUnique(n);
        return n - unique;
    }

    private static int countUnique(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        int[] digits = new int[len];
        for (int i = 0; i < len; i++) {
            digits[i] = s.charAt(i) - '0';
        }
        int count = 0;
        // Count numbers with fewer digits
        for (int i = 1; i < len; i++) {
            count += countUniqueWithLength(i);
        }
        // Count numbers with the same number of digits and <=n
        count += countUniqueWithSameLength(digits);
        return count;
    }

    private static int countUniqueWithLength(int length) {
        if (length == 0) return 0;
        if (length > 10) return 0;
        int count = 9; // first digit has 9 options (1-9)
        int available = 9; // remaining digits start with 9 options (0-9 excluding first digit)
        for (int i = 1; i < length; i++) {
            count *= available;
            available--;
        }
        return count;
    }

    private static int countUniqueWithSameLength(int[] digits) {
        boolean[] used = new boolean[10];
        return backtrack(digits, 0, used, true);
    }

    private static int backtrack(int[] digits, int pos, boolean[] used, boolean isTight) {
        if (pos == digits.length) {
            return 1;
        }
        int count = 0;
        int upper = isTight ? digits[pos] : 9;
        int start = (pos == 0) ? 1 : 0; // first digit cannot be 0

        for (int d = start; d <= upper; d++) {
            if (used[d]) continue;
            boolean newIsTight = isTight && (d == digits[pos]);
            boolean[] newUsed = Arrays.copyOf(used, used.length);
            newUsed[d] = true;
            count += backtrack(digits, pos + 1, newUsed, newIsTight);
        }
        return count;
    }
}
