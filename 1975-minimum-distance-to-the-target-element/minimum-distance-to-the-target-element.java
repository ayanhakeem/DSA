class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int minabs=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int abs=Math.abs(i-start);
                minabs=Math.min(minabs,abs);
            }
        }
        return minabs;
    }
}