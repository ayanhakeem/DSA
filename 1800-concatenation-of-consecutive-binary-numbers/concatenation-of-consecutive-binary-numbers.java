class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int mod = 1000000007;

        for (int i = 1; i <= n; i++) {
            int len = Integer.toBinaryString(i).length();
            result = ((result << len) + i) % mod;
        }

        return (int) result;
    }
}