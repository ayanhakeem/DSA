class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int upper[]=new int[26];
        int lower[]=new int[26];

        for(int i=0;i<n;i++){
          char ch=word.charAt(i);
          if(Character.isUpperCase(ch)){
            upper[ch-'A']++;
          }else if(Character.isLowerCase(ch)){
            lower[ch-'a']++;
          }
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(lower[i]>0 && upper[i]>0){
                cnt++;
            }
        }
        return cnt;
    }
}