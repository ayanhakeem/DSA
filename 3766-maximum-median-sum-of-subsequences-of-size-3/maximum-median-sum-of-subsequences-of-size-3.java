import java.util.*;
class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long ans=0;
        for(int i=0,j=n-1;i<j;i++,j--){
            int n1=nums[i];
            int n2=nums[j];
            int n3=nums[--j];
            ans+=n3;
        }
        return ans;
    }
}