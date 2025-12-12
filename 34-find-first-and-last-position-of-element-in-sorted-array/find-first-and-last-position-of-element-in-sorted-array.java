class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int n=nums.length;
        if(n==1 && nums[0]==target){//if nums length is 1 and nums[0]==target then store ans[0]=0 
            ans[0]=0;
            ans[1]=0;
            return ans;
        }

        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){//if mid==target then search on left is there any occurences means first occurence bcoz array is sorted means elements equal to target lies consecutive
                int l=mid;//assign var l as mid 
                while(l>=low && nums[l]==target) l--;//search left occurance means first
                ans[0]=l+1;
                int r=mid;
                while(r<=high && nums[r]==target) r++;//search right occurance means last
                ans[1]=r-1;
                return ans;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;

        
    }
}
//use binary search on sorted array 
//tc=o(logn)
//sc=o(1)