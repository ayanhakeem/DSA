class Solution {
    public int numSub(String s) {
        int MOD = 1_000_000_007;
        long count = 0;  
        long result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                result = (result + count) % MOD;
            } else {
                count = 0;
            }
        }
        
        return (int) result;
    }
}
