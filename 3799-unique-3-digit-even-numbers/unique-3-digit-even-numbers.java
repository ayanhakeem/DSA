class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        
        int n = digits.length;
        
        // Try every combination of three different digits
        for (int i = 0; i < n; i++) {   // First digit
            if (digits[i] == 0) continue; // No leading zero
            
            for (int j = 0; j < n; j++) { // Second digit
                if (i == j) continue; // Avoid reusing the same digit
                
                for (int k = 0; k < n; k++) { // Third digit (must be even)
                    if (i == k || j == k) continue; // Avoid reusing the same digit
                    if (digits[k] % 2 != 0) continue; // Last digit must be even
                    
                    // Form the three-digit number
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    uniqueNumbers.add(num);
                }
            }
        }
        return uniqueNumbers.size();
    }
}