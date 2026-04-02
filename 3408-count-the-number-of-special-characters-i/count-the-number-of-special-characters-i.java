class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int hash[]=new int[26];
        
        for(int i=0;i<n;i++){
            if(Character.isLowerCase(word.charAt(i))){
                hash[word.charAt(i)-'a']++;
            }
           
        }
        int cnt=0;
        boolean counted[]=new boolean[26];
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))){
                int idx=word.charAt(i)-'A';
                if(hash[idx]>=1 && counted[idx]==false){
                    cnt++;
                    counted[idx]=true;
                }
            }
        }
        return cnt;
    }
}