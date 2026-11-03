class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length, tot = 0;
        
        for (int x : nums)
            if (x == 1) tot++;

        if (tot == 0 || tot == n) return 0;

        
        int zeros=0;
        for (int i = 0; i < tot; i++)
            if (nums[i] == 0) zeros++;
        int min = zeros;
        for(int i=tot;i<n+tot;i++){
            if(nums[i%n]==0) zeros++;
            if(nums[(i-tot)%n]==0) zeros--;
            min=Math.min(min,zeros);
        }
        return min;
    }
}
//tc=o()