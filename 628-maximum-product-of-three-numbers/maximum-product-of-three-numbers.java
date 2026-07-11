class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod1=1;
        int n=nums.length;
        for(int i=n-1;i>=n-3;i--){
            prod1*=nums[i];
        }
        int prod2=1;
        for(int i=0;i<2;i++){
            prod2*=nums[i];
        }
        prod2*=nums[n-1];
        if(prod1>prod2){
            return prod1;
        }
        return prod2;
    }
}