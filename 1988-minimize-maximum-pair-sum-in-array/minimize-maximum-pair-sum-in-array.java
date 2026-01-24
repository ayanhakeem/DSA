class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0,r=n-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            max=Math.max(max,nums[l]+nums[r]);
            l++;
            r--;
        }
        

        return max;
    }
}