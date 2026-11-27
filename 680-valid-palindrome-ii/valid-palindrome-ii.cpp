
class Solution {
public:
    bool isPalindrome(string s, int l, int r) {
        while(l < r) {
            if(s[l] != s[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    bool validPalindrome(string s) {
        int n = s.length();

        if(n <= 2) return true;

        int l = 0, r = n - 1;

        while(l < r) {

            if(s[l] != s[r]) {

                // Ignore left character
                if(isPalindrome(s, l + 1, r))
                    return true;

                // Ignore right character
                if(isPalindrome(s, l, r - 1))
                    return true;

                return false;
            }

            l++;
            r--;
        }

        return true;
    }
};
