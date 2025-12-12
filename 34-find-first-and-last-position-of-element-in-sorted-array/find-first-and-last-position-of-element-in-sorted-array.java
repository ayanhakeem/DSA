class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int n=nums.length;
        if(n==1 && nums[0]==target){
            ans[0]=0;
            ans[1]=0;
            return ans;
        }

        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                int l=mid;
                while(l>=low && nums[l]==target) l--;//search left occurance
                ans[0]=l+1;
                int r=mid;
                while(r<=high && nums[r]==target) r++;//search right occurance
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