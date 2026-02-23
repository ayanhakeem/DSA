class Solution {
    public String maximumXor(String s, String t) {
        int count = 0;
        for (char c : t.toCharArray()) {
            if (c == '1') count++;
        }

        char[] result = new char[s.length()];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (count > 0) {
                    result[i] = '1';
                    count--;
                } else {
                    result[i] = '0';
                }
            } else {
                if (count < n - i) {
                    result[i] = '1';
                } else {
                    result[i] = '0';
                    count--;
                }
            }
        }

        return new String(result);
    }
}
//t=o(n)
//sc=o(n)