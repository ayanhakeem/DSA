class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int used = 0; // bitmask of current subarray
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            while ((used & nums[j]) != 0) { 
                used ^= nums[i]; // remove leftmost
                i++;
            }
            used |= nums[j];
            maxLen = Math.max(maxLen, j - i + 1);
        }
        
        return maxLen;
    }
}  