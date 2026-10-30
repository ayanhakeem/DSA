class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
       int original=x;

       long res=0;

       while(x>0){
        int ld=x%10;
        res=res*10+ld;
        x/=10;
       }
       return res==original;

    }
};