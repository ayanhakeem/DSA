class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<3) return false;
        int i=0;
        while(i+1<n && nums[i]<nums[i+1]){
           i++;
        }
        if(i==0 || i==n-1) return false;//no peak found
        int p1=i;
        while(i+1<n && nums[i]>nums[i+1]){
            i++;
        }
        if(i == p1 || i == n - 1) return false;//no velly it reamins as it is
        int p2=i;
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        return i==n-1;//if it reach last
        
    }
}