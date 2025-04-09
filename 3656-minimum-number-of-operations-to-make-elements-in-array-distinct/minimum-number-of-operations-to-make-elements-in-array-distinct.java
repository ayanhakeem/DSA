import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        int i = n - 1;
        while (i >= 0) {
            if (seen.contains(nums[i])) {
                break;
            }
            seen.add(nums[i]);
            i--;
        }
        int elementsToRemove = i + 1;
        return (elementsToRemove + 2) / 3; // Equivalent to ceiling(elementsToRemove / 3)
    }
}
    