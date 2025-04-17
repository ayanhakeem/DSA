class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse digits from the end (least significant digit)
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;  // Just add 1 if no carry needed
                return digits;
            }

            // If current digit is 9, set it to 0 and carry over
            digits[i] = 0;
        }

        // If we reach here, all digits were 9 (e.g., 999 -> 1000)
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;  // leading 1, rest are already 0 by default
        return newNumber;
    }
}
