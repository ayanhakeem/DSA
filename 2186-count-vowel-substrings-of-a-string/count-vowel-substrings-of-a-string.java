class Solution {
       private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;
        
        for (int start = 0; start < n; start++) {
            Map<Character, Integer> vowelCount = new HashMap<>();
            
            for (int end = start; end < n; end++) {
                char c = word.charAt(end);
                
                if (!isVowel(c)) {
                    break; // Non-vowel found, reset
                }
                
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
                
                if (vowelCount.size() == 5) {
                    count++; // All vowels found, count this substring
                }
            }
        }
        
        return count;
    }
}