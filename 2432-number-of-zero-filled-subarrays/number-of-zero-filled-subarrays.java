class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long streak=0;
        long tot=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                streak++;
            }else{
                streak=0;
            }
            tot+=streak;
        }
        return tot;
    }
}