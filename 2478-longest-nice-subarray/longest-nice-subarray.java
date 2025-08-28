class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int mask = 0; // bitmask of current subarray
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            while ((mask & nums[j]) != 0) { //keep shrinking window until ==0
                mask ^= nums[i]; // remove leftmost for remove xor operation used
                i++;
            }
            mask |= nums[j];//if ==0 add into mask or opertion
            maxLen = Math.max(maxLen, j - i + 1);//update len
        }
        
        return maxLen;
    }
}  