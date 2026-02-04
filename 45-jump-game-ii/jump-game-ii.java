class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int end = 0;      // end of current jump range
        int maxidx = 0;   // farthest reachable index

        for (int i = 0; i < n - 1; i++) {
            maxidx = Math.max(maxidx, i + nums[i]);

            // when we reach the end of current jump range
            if (i == end) {
                jumps++;
                end = maxidx;
            }
        }
        return jumps;
    }
}
