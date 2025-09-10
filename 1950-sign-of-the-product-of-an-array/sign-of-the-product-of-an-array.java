class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int cneg=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0){
                cneg++;
            }
        }
        if(cneg%2==1){//odd neg
            return -1;
        }else{
            return 1;
        }
        
    }
}