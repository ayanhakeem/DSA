class Solution {
    public int longestMountain(int[] arr) {
      if (arr.length < 3) return 0;

        int maxLen = 0;
        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Expand left
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Expand right
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Update max length
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}