class Solution {
    public int reverse(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            res=(res*10)+rem;
        }
        return res;
    }
    public boolean isSameAfterReversals(int num) {
        int a=reverse(num);
        int b=reverse(a);
        if(b==num) return true;
        return false;
        
    }
} 