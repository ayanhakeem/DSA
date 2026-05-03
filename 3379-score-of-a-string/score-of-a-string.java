class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            char p=s.charAt(i-1);
            char c=s.charAt(i);
            int pa=p-'a';
            int ca=c-'a';
            int abs=Math.abs(pa-ca);
            sum+=abs;
        }
        return sum;
        
    }
}