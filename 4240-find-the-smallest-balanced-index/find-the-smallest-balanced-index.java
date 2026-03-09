class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        int balanced=-1;
        long left[]=new long[n];
        long right[]=new long[n];
        left[0]=0;
        long sum=nums[0];
        for(int i=1;i<n;i++){
            left[i]=sum;
            sum+=nums[i];
        }
        long maxSum=sum; // ← cap to prevent overflow
        right[n-1]=1;
        long prod=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=prod>maxSum ? Long.MAX_VALUE : prod; // ← cap overflow
            prod=prod>maxSum ? Long.MAX_VALUE : prod*nums[i]; // ← stop multiplying if overflow
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return balanced;
    }
}