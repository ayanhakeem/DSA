class Solution {
    public int maxProduct(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int fe=nums[n-1]-1;
       int se=nums[n-2]-1;
       int p=fe*se;
       return p; 
    }
}