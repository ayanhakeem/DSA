class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int hash1[]=new int[128];
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            hash1[c]++;
        }
        int hash2[]=new int[128];
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            hash2[c]++;
        }

        for(int i=0;i<128;i++){
            if(hash2[i]>hash1[i]) return false;
        }
        return true;
    }
}