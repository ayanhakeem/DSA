class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int ramp = 0;
        int maxright[]=new int[n];
        maxright[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            maxright[i]=Math.max(maxright[i+1],nums[i]);
        }

        int i=0;
        int j=0;
        while(j<n){
            while(i<j && nums[i]>maxright[j]){
                i++;
            }
            ramp=Math.max(ramp,j-i);
            j++;
        }
        return ramp;

       
    }
}
