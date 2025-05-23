class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[] prev = new boolean[m + 1];
        boolean[] cur = new boolean[m + 1];

        prev[0] = true; // empty string matches empty pattern

        // Initialize first row (s is empty)
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                prev[j] = prev[j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            cur[0] = false; // pattern is empty, string is not

            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    cur[j] = prev[j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    cur[j] = prev[j] || cur[j - 1];
                } else {
                    cur[j] = false;
                }
            }

            // Shift current row to previous for next iteration
            boolean[] temp = prev;
            prev = cur;
            cur = temp;
        }

        return prev[m];
    }
}
