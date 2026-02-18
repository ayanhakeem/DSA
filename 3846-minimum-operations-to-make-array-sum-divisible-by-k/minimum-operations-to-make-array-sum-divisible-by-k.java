class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if(sum<k) return sum;//if sum<k we cant get sum divisible by k
        int op=sum%k;
        return op;
        




        
        
    }
}

//tc=o(n)
//sc=o(1)