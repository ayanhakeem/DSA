import java.util.*;

class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> dq = new ArrayDeque<>(); // deque
        int cnt = 0; // count non-negative numbers

        // Step 1: separate elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[i] = nums[i]; // negatives stay in same position
            } else {
                dq.addLast(nums[i]);
                cnt++;
            }
        }

        // Edge case
        if (cnt == 0) return ans;

        // Step 2: remove redundant rotations
        k = k % cnt;

        // Step 3: left rotate non-negative elements
        while (k-- > 0) {
            dq.addLast(dq.removeFirst());
        }

        // Step 4: place back rotated elements
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                ans[i] = dq.removeFirst();
            }
        }

        return ans;
    }
}
