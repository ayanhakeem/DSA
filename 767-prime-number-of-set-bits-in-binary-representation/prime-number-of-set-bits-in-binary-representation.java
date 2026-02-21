class Solution {
    public static int countbits(int n){
        int res=0;
        while(n>0){
            int lsb=(n&1);
            if(lsb==1){
                res++;
            }
            n=n>>1;
        }
        return res;
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            if(isprime(countbits(i))){
                cnt++;
            }
        }
        return cnt;
        
    }
}