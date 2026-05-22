// class Solution {
//     public int findMin(int[] nums) {
//         int n=nums.length;
//         int min=Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//         min=Math.min(min,nums[i]);
//        }
//        return min;
//     }
// }
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int st=0,end=n-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]>nums[end]){
                st=mid+1;//min ele lies on right bcoz right side is sorted but not left side partial sorted
            }else if(nums[mid]<nums[end]){
                end=mid;
            }else{
                //duplicates
                end--;
            }
        }
        return nums[st];
    }
}