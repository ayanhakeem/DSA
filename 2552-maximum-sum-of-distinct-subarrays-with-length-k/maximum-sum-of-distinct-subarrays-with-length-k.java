class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        int left = 0;

        long sum = 0;
        long max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Maintain window size k
            while (i - left + 1 > k) {

                sum -= nums[left];

                int freq = map.get(nums[left]);

                if (freq == 1) {
                    map.remove(nums[left]);
                } else {
                    map.put(nums[left], freq - 1);
                }

                left++;
            }

            // Check distinct elements
            if (i - left + 1 == k && map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}