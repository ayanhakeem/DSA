//tc=0(logn)   Binary search applied
//sc=0(1)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==nums[mid^1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return nums[low];

        
    }
}