class Solution {
    public double myPow(double x, int n) {
        if(n==0){//bc
            return 1;
        }
        else if(n<0){
            n=-n;
            x=1/x;
            return x*myPow(x,n-1);
        }
        double h=myPow(x,n/2);
        double hs=h*h;
        if(n%2!=0){
            hs=x*hs;
        }
        return hs;
    }
}
