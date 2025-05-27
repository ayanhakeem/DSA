import java.util.Stack;

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int third = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

      
        for (int i = n - 1; i >= 0; i--) {
            // Check if we found a valid '1' for the 132 pattern
            if (nums[i] < third) {
                return true;
            }

            // Maintain stack in decreasing order
            // Pop values smaller than nums[i] and update 'third'
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); // potential '2' in 132
            }

            // Push current value as candidate for '3'
            stack.push(nums[i]);
        }

        return false;
    }
}
