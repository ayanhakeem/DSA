class Solution {
    public boolean checkRecord(String s) {
        int n=s.length();
        int cnta=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                cnta++;
            }
        }
        int cntl=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)=='L' && s.charAt(i)=='L'){
                cntl++;
                max=Math.max(cntl,max);
            }else{
                cntl=1;
            }
        }
        if(cnta<2 && max<3) return true;
        return false;
    }
}