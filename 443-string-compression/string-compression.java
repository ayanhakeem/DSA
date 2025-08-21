class Solution {
    public int compress(char[] chars) {

        // Step 1: Convert char[] to String
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {   // fixed loop
            sb.append(c);
        }
        String res = sb.toString(); // e.g., "aaabbcc"

        // Step 2: Compress
        StringBuilder sb2 = new StringBuilder();
        int n = res.length();
        int i = 0;

        while (i < n) {
            char ch = res.charAt(i);   // fixed (was s.charAt)
            int count = 1;

            while (i < n - 1 && res.charAt(i) == res.charAt(i + 1)) {
                i++;
                count++;
            }

            sb2.append(ch);
            if (count > 1) {
                sb2.append(count);
            }
            i++;
        }

        // Step 3: Copy back compressed string into chars[]
        String ans = sb2.toString();  // fixed (was sb.toString)
        int newLen = ans.length();
        for (int j = 0; j < newLen; j++) {
            chars[j] = ans.charAt(j);
        }

        return newLen; // return compressed length
    }
}
