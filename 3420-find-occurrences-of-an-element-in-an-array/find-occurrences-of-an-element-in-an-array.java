class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length;
        int q = queries.length;

        int indices[] = new int[n];
        int k = 0;

        
        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                indices[k++] = i;
            }
        }

        int ans[] = new int[q];

       
        for (int i = 0; i < q; i++) {
            int occurrence = queries[i];

            if (occurrence > k) {
                ans[i] = -1;
            } else {
                ans[i] = indices[occurrence - 1];
            }
        }

        return ans;
    }
}