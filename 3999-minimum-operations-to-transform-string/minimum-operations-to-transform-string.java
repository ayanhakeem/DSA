class Solution {
    
    public int minOperations(String s) {
        int maxShift = 0;

        for (char c : s.toCharArray()) {
            // Calculate how many shifts needed to convert c to 'a'
            int shift = (26 - (c - 'a')) % 26;
            maxShift = Math.max(maxShift, shift);//max why means every char has to reach a if any char has min op to reach a but another ont so take max of both
        }

        return maxShift;
    }
        
    
}
//tc=o(n)
//sc=o(1)