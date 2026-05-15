class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]>nums[n-1]){
                st=mid+1;//min ele lies on right bcoz right side is sorted but not left side partial sorted
            }else{
                end=mid-1;
            }
        }
        return nums[st];
    }
}