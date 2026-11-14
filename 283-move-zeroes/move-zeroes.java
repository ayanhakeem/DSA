class Solution {
    private static void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0,i=0;
        while(i<n){
            if(nums[i]!=0){
                swap(nums,i,l);
                l++;
            }
            i++;
        }
    }
}