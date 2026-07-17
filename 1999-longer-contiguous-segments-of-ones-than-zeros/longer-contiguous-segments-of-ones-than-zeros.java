class Solution {
    public boolean checkZeroOnes(String s) {
        int cnt0=0,cnt1=0;
        int max0=0,max1=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                cnt0++;
                max0=Math.max(max0,cnt0);
            }else{
                cnt0=0;
            }
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                cnt1++;
                max1=Math.max(max1,cnt1);
            }else{
                cnt1=0;
            }
        }

        if(max1>max0) return true;

        return false;
    }
}