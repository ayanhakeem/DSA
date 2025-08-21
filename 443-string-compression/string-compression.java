class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0; 
        int i = 0;

        while (i < n) {
            char ch = chars[i];
            int count = 0;

          
            while (i < n && chars[i] == ch) {
                i++;
                count++;
            }

            
            chars[idx++] = ch;

           
            if (count > 1) {
                String cntStr = String.valueOf(count);
                for (char c : cntStr.toCharArray()) {
                    chars[idx++] = c;
                }
            }
        }

        return idx; 
    }
}
//tc=o(n)
//sc=o(1)