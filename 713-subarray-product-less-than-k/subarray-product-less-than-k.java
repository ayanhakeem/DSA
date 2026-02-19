class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        int mul=1;
        int l=0;
        if(k<=1) return 0;
        for(int r=0;r<n;r++){
            mul*=nums[r];
            while(mul>=k && l<n){
                mul/=nums[l];
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;
        
    }
}