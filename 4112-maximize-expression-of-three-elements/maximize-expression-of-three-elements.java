class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int s=0;
        Arrays.sort(nums);
        int a=nums[n-1];
        int b=nums[n-2];
        for(int i=n-3;i>=0;i--){
            s=a+b-nums[i];
            max=Math.max(max,s);
        }
        return max;
       
        
    }
}