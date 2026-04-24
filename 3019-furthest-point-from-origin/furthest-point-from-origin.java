class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int l=0,r=0,s=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'){
                l++;
            }else if(moves.charAt(i)=='R'){
                r++;
            }else{
                s++;
            }
        }

        int lm=l+s-r;
        int rm=r+s-l;
        return (lm>rm?lm:rm);
    }
}