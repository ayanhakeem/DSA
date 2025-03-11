import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();
        int[] result = new int[nums1.length];

        // Compute Next Greater Elements for nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            ngeMap.put(nums2[i], s.isEmpty() ? -1 : s.peek());
            s.push(nums2[i]);
        }

        // Fill result for nums1 based on computed map
        for (int i = 0; i < nums1.length; i++) {
            result[i] = ngeMap.get(nums1[i]);
        }

        return result;
    }
}
