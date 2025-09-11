class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    
    private boolean isVowelSubstring(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                return false; 
            }
            vowels.add(c);
        }
        return vowels.size() == 5;
    }

    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;

       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = word.substring(i, j);
                if (isVowelSubstring(substring)) {
                    count++;
                }
            }
        }
        
        return count;
    }

}
