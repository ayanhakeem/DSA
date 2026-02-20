class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int cnt=0;
        String repeated=word;
        while(sequence.contains(repeated)){
            cnt++;
            repeated+=word;
        }
        return cnt;
        
    }
}