import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>(); // ✅ Correct capitalization of HashSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) { // ✅ Typo fixed: "conatins" → "contains"
                return i;
            }
        }
        return -1; // Just in case, though logically unreachable
    }
}
