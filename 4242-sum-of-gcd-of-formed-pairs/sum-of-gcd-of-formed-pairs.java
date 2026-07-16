class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int mx[]=new int[n];
        mx[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            mx[i]=max;
        }
        int pg[]=new int [n];
        for(int i=0;i<n;i++){
            pg[i]=gcd(nums[i],mx[i]);
        }

        Arrays.sort(pg);

        int l=0,r=n-1;
        long sum=0;
        while(l<r){
            int res=gcd(pg[l],pg[r]);
            sum+=res;
            l++;
            r--;
        }
        
        return sum;
    }
}