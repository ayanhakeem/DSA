class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int cnt=1;
       int max=1;
       int n=nums.length;
       for(int i=1;i<n;i++){
        if(nums[i-1]<nums[i]){
            cnt++;
            max=Math.max(cnt,max);
        }else{
            cnt=1;
        }
       }
       return max;
    }
}