import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char curr = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > curr) {
                st.pop();
                k--;
            }

            st.push(curr);
        }

        // If k is still left, remove from the end
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build the result
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If all digits are removed
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}