//tc=o(n)
//sc=o(1)

import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if (n == 0) return ans;

        int start = 0; // Start index of the range

        for (int i = 1; i <= n; i++) {
            // Check if we reached the end or there's a break in the sequence
            if (i == n || nums[i] != nums[i - 1] + 1) {
                // Add range
                if (start == i - 1) {//at last st=5(i) and st==i-1(6-1)
                    ans.add(String.valueOf(nums[start]));
                } else {
                    ans.add(nums[start] + "->" + nums[i - 1]);
                }
                start = i; // update start after sequence
            }
        }
        return ans;
    }
}