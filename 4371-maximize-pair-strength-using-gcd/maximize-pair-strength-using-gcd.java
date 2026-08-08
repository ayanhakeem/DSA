class Solution {
    private static long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        int n=nums.length;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long prod=(long)nums[i]*nums[j];
                long gcdnum=gcd(nums[i],nums[j]);
                long strength=prod/(gcdnum*gcdnum);
                max=Math.max(max,strength);
            }
        }
        return max;
    }
}