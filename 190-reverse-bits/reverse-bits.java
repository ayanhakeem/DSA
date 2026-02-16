class Solution {
    public int reverseBits(int n) {
        if(n==0){
            return 0;
        }
        int res=0;
        for(int i=1;i<=32;i++){
            res<<=1;

            res=(res | n&1);

            n>>=1;


        }
        return res;
        
    }
}
//tc=o(32)
//sc=o(1)