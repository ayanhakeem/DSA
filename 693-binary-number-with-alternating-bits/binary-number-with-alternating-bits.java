class Solution {
    public boolean hasAlternatingBits(int n) {
        //find lsb and see  if adj are same
        
        int prevlsb=-1;
        while(n>0){
            
            int currlsb=(n&1);
            n=n>>1;//do right shift after get lsb
            if(prevlsb==currlsb) return false;
            prevlsb=currlsb; 
            
             
        }

        return true;
        
    }
}