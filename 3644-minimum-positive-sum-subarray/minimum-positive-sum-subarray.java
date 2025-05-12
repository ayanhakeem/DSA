class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false;

        for (int size = l; size <= r; size++) {
            for (int i = 0; i <= n - size; i++) {
                int sum = 0;
                for (int j = 0; j < size; j++) {
                    sum += nums.get(i + j);
                }
                if (sum > 0) {
                    found = true;
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return found ? minSum : -1;
    }
}
