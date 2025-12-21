class Solution {
    public static int rev(int n){
        int res=0;
        while(n!=0){
            int rem=n%10;
            res=res*10+rem;
            n=n/10;

        }
        return res;
    }
    public int mirrorDistance(int n) {
        int abs=Math.abs(n-rev(n));
        return abs;
        
    }
}