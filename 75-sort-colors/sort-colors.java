class Solution {
    private static void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void sortColors(int[] nums) {
        int l=0,m=0,r=nums.length-1;
        while(m<=r){
            if(nums[m]==2){
                swap(nums,m,r);
                r--;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,l);
                l++;
                m++;
            }
        }
    }
}