class Solution {
    public int minLengthAfterRemovals(String s) {
        int ca=0;
        int cb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ca++;
            }else{
                cb++;
            }
        }
        if(ca==cb) return 0;
        else return Math.abs(ca-cb);
        
    }
}