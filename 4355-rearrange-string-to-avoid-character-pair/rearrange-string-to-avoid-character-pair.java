class Solution {
    public String rearrangeString(String s, char x, char y) {
        int hash[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        while(hash[y-'a']>0){
            sb.append(y);
            hash[y-'a']--;
        }
        while(hash[x-'a']>0){
            sb.append(x);
            hash[x-'a']--;
        }
        

        for(int i=0;i<26;i++){
            while(hash[i]>0){
                sb.append((char)(i+'a'));
                hash[i]--;
            }
        }

        return sb.toString();
    }
}