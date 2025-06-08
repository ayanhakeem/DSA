class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int opsToMakeAll1 = countFlips(nums.clone(), 1);
        int opsToMakeAllNeg1 = countFlips(nums.clone(), -1);
        int minOps = Math.min(opsToMakeAll1, opsToMakeAllNeg1);
        return minOps <= k;
    }

    private int countFlips(int[] nums, int target) {
        int ops = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != target) {
                // Flip nums[i] and nums[i+1]
                nums[i] *= -1;
                nums[i + 1] *= -1;
                ops++;
            }
        }
        // Check if last element matches target
        if (nums[nums.length - 1] != target) return Integer.MAX_VALUE;
        return ops;
    }
}
