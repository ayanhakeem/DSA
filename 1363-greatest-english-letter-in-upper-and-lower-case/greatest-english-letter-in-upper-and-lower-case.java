class Solution {
    public String greatestLetter(String s) {
        int n=s.length();
        int upper[]=new int[26];
        int lower[]=new int[26];

        for(int i=0;i<n;i++){
          char ch=s.charAt(i);
          if(Character.isUpperCase(ch)){
            upper[ch-'A']++;
          }else if(Character.isLowerCase(ch)){
            lower[ch-'a']++;
          }
        }

        int l=25,r=25;
        // while(l>=0 && r>=0){
        //     if(upper[l]>0 && lower[r]>0){
        //         return String.valueOf((char)(l+'A'));
        //     }
        //     l--;
        //     r--;
        // }
        for (int i = 25; i >= 0; i--) {
            if (upper[i] > 0 && lower[i] > 0) {
                return String.valueOf((char)(i + 'A'));
            }
        }
        return "";
    }
}