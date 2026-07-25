class Solution {
    public int maxProduct(int n) {
        int fm=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;

        while(n>0){
            int ld=n%10;
            if(fm<ld){
                sm=fm;
                fm=ld;
            }else{
                sm=Math.max(sm,ld);
            }
            n/=10;
        }
        return fm*sm;

    }
}