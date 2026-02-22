class Solution {

    public boolean check(int a,int b){
        int ans[]=new int[10];
        while(a>0){
            ans[a%10]++;
            a/=10;
        }
        while(b>0){
            ans[b%10]--;
            b/=10;
        }

        for(int i:ans){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static int  fact(int n){
        int fac=1;
        while(n>1){
            fac=fac*n;
            n--;
        }
        return fac;
        
       
    }
    public boolean isDigitorialPermutation(int n) {
        int res=0;
        int original=n;
        while(n>0){
            int rem=n%10;
            res+=fact(rem);
            n/=10;
        }

        return check(res,original);
       

        
        
    }
}