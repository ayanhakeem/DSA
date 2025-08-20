class Solution {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {   // strictly < is enough
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // in case k > n

        // Step 1: reverse first n-k elements
        reverse(nums, 0, n - k - 1);

        // Step 2: reverse last k elements
        reverse(nums, n - k, n - 1);

        // Step 3: reverse the whole array
        reverse(nums, 0, n - 1);
    }
}
