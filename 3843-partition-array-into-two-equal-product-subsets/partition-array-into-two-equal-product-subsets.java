class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;

        // Loop through all non-empty proper subsets using bitmasking
        for (int mask = 1; mask < (1 << n) - 1; mask++) {
            long product1 = 1;
            long product2 = 1;
            boolean valid1 = false;
            boolean valid2 = false;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    product1 *= nums[i];
                    if (product1 > target) break;
                    valid1 = true;
                } else {
                    product2 *= nums[i];
                    if (product2 > target) break;
                    valid2 = true;
                }
            }

            if (valid1 && valid2 && product1 == target && product2 == target) {
                return true;
            }
        }

        return false;
        
    }
}