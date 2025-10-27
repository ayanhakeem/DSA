class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        // Step 1: Convert all elements to positive
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        // Step 2: Sort ascending (we will use left=max, right=min)
        Arrays.sort(nums);

        long sum = 0;
        int left = n - 1;   // start from max
        int right = 0;      // start from min
        boolean addTurn = true; // start by adding max

        // Step 3: alternate between max (add) and min (subtract)
        while (left >= right) {
            if (addTurn) {
                sum += (long) nums[left] * nums[left];  // add maximum
                left--;
            } else {
                sum -= (long) nums[right] * nums[right]; // subtract minimum
                right++;
            }
            addTurn = !addTurn; // alternate
        }

        return sum;
    }
}
