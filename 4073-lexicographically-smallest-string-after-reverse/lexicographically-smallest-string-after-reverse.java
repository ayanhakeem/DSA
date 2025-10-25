class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        String ans = s;  

        for (int k = 1; k <= n; k++) {
            // Option 1: reverse the first k characters
            String firstRev = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);

            // Option 2: reverse the last k characters
            String lastRev = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();

            // Compare and update answer
            if (firstRev.compareTo(ans) < 0) ans = firstRev;
            if (lastRev.compareTo(ans) < 0) ans = lastRev;
        }

        return ans;
    }
}
