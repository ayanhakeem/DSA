class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int firstnum=0;
        int secnum=1;
        for(int i=2;i<=n;i++){
            int nextnum=firstnum+secnum;
            firstnum=secnum;
            secnum=nextnum;
        }
        
        return secnum;
        
    }
}