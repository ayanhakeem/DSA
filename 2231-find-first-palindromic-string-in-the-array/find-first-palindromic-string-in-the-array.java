class Solution {
    public static boolean ispalindrome(String s){
        int n=s.length();
        int l=0,r=n-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        String ans="";
        for(int i=0;i<n;i++){
            if(ispalindrome(words[i])){
                ans+=words[i];
                break;
            }
        }
        return ans;

    }
}