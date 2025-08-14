import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {//o(n) tc
            Map<Character, Integer> freqMap = new HashMap<>();//o(1) sc
            
            // Count frequencies excluding the i-th character exclude ith char
            for (int j = 0; j < word.length(); j++) { //o(n)
                if (j == i) continue;
                char c = word.charAt(j);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
            
            // Check if all frequencies are equal
            Set<Integer> freqSet = new HashSet<>(freqMap.values());
            if (freqSet.size() == 1) {
                return true;
            }
        }
        return false;
    }
}
//tc=o(n2)
//sc=o(n)