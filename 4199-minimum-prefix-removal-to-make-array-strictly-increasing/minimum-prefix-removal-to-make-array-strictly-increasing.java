class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int idx=0;
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                idx=i;
                break;
                
                
            }
        }
        return idx;
    }
}