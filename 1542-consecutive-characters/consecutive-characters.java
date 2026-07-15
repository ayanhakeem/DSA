class Solution {
    public int maxPower(String s) {
       int n=s.length();
       if(n==1) return 1;
       int cnt=1;
       int max=0;
       for(int i=1;i<n;i++){
        if(s.charAt(i-1)==s.charAt(i)){
            cnt++;
            max=Math.max(max,cnt);
        }else{
            cnt=1;
        }
       }
       max=Math.max(max,cnt);
       return max;
    }
}