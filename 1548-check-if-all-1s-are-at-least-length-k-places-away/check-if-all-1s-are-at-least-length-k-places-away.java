class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int firstone=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==1){
                int diff=i-firstone;
                if(diff<=k){
                    return false;
                }
                firstone=i;
            }
        }
        return true;
    }
}