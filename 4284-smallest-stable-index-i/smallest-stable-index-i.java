class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int ngl[]=new int[n];
        int nsr[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            ngl[i]=max;
        }
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            nsr[i]=min;
        }

        for(int i=0;i<n;i++){
            int ans=ngl[i]-nsr[i];
            if(ans<=k) return i;
        }
        return -1;
    }
}