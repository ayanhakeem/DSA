class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        int max=0;
        int cntzeros=0;
        while(r<n){
            if(nums[r]==0){
                cntzeros++;
            }
            if(cntzeros>k){
                if(nums[l]==0){
                    cntzeros--;
                }
                l++;
            }
            if(cntzeros<=k){
                int len=r-l+1;
                max=Math.max(max,len);
            }
            r++;
        }
        return max;

    }
}