class Solution {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();
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
                string cntStr = to_string(count);
                for (char c : cntStr) {
                    chars[idx++] = c;
                }
            }
        }

        return idx; 
    }
};