class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int cnt=1;
        int max=1;
        if(n==0) return 0;
        if(n==1) return 1;
        
        
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
            }else{
                max=Math.max(max,cnt);
                cnt=1;
            }
        }
        max=Math.max(max,cnt);
        return max;
    }
}