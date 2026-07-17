class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt1=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt1++;
                max=Math.max(cnt1,max);
            }else{
                cnt1=0;
            }
        }
    

        return max;
    }
}
//tc=o()