class Solution {
    public int minimumSwaps(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) cnt++;
        }

        int ops=0;
        int i=n-1;
        while(cnt-->0){
            if(nums[i]!=0) ops++;
            i--;
        }
        return ops;

        
    }
}