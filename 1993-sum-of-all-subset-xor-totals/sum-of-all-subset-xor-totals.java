class Solution {
    int totalsum=0;
    public void func(int idx,int xor,int nums[],int n){
        if(idx==n){
            totalsum+=xor;
            return;
        }
        func(idx+1,xor^nums[idx],nums,n);
        func(idx+1,xor,nums,n);
    }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        func(0,0,nums,n);
        return totalsum;
    }
}