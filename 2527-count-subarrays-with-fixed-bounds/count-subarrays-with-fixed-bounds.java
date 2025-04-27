class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int maxpos=-1,minpos=-1,badpos=-1;
        long ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<minK || nums[i]>maxK){
                badpos=i;
            }
            if(nums[i]==minK){
                minpos=i;
            }
            if(nums[i]==maxK){
                maxpos=i;
            }
            int smaller=Math.min(minpos,maxpos);
            long temp=smaller-badpos;
            ans+=(temp<=0)?0:temp;
            
        }
        return ans;
        

        
    }
}