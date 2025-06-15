class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int n = arr.length;
        int totalSum = 0;

        for (int start = 0; start < n; start++) {
            for (int len = 1; start + len <= n; len += 2) {
                for (int i = start; i < start + len; i++) {
                    totalSum += arr[i];
                }
            }
        }

        return totalSum;
    }
}