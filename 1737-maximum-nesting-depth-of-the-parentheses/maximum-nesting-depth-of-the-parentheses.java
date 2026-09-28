class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int cnt=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                cnt++;
                max=Math.max(max,cnt);
            }else if(s.charAt(i)==')'){
                cnt--;
            }else{
                continue;
            }
        }
        return max;
    }
}