class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int pidx=0,nidx=1;//starting of pos and neg idxes
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[nidx]=nums[i];
                nidx+=2;
            }else{
                ans[pidx]=nums[i];
                pidx+=2;
            }
        }
        return ans;
    }
}
//tc=o(n)
//sc=o(n)