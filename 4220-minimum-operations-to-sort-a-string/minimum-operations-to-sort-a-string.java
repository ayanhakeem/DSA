class Solution {
    public static boolean isSorted(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }

    public int minOperations(String s) {
        int n = s.length();

        // Hint 1: already sorted
        if (isSorted(s)) return 0;

        char min = s.charAt(0);
        char max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) min = c;
            if (c > max) max = c;
        }

        // Hint 3: impossible case
        // entire string is just [max, min] → can't select proper substring
        if (n == 2) return -1;

        // Hint 2: min appears in proper prefix OR max appears in proper suffix
        // proper prefix = s[0..n-2], proper suffix = s[1..n-1]
        boolean minInPrefix = s.charAt(0) == min;        // min at start
        boolean maxInSuffix = s.charAt(n - 1) == max;    // max at end

        if (minInPrefix || maxInSuffix) return 1;

        // Hint 4:
        // check if min exists ANYWHERE in proper prefix (indices 0 to n-2)
        boolean minExistsInPrefix = false;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == min) {
                minExistsInPrefix = true;
                break;
            }
        }

        // check if max exists ANYWHERE in proper suffix (indices 1 to n-1)
        boolean maxExistsInSuffix = false;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == max) {
                maxExistsInSuffix = true;
                break;
            }
        }

        // Hint 4: neither exists → need 3 ops
        if (!minExistsInPrefix && !maxExistsInSuffix) return 3;

        // otherwise → 2 ops
        return 2;
    }
}