class Solution {
    public boolean isPalindrome(String s) {
       int start=0;
       int last=s.length()-1;
       while(start<=last){
        if(!Character.isLetterOrDigit(s.charAt(start))){//if not a alphanumeric at start
            start++;
        }else if(!Character.isLetterOrDigit(s.charAt(last))){//if not a alphanumeric at last
            last--;
        }else if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(last))){
            return false;//if not equal lower from both ends
        }else{
            start++;
            last--;
        }
       }
        return true;
    }
}
//tc=o(1)
//sc=o(1)