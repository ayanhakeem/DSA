class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (!st.isEmpty() &&
                Character.toLowerCase(st.peek()) == Character.toLowerCase(curr) &&
                Character.isUpperCase(st.peek()) != Character.isUpperCase(curr)) {
                st.pop(); // valid pair found, cancel them out
            } else {
                st.push(curr);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString(); // reverse to restore original order
    }
}