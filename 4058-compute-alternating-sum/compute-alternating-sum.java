class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=nums[i];
            }else{
                sum-=nums[i];
            }
        }
        return sum;
        
    }
}