class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0,streak=1;
        int cnt=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)) streak++;//consecuitive 1s
            else{
                prev=streak;
                streak=1;
            }
            if(streak<=prev){
                cnt++;
            }
        }
        return cnt;
        
    }
}