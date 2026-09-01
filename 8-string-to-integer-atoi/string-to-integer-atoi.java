class Solution {
    public int myAtoi(String s) {
       int i=0;
       int n=s.length();

       //skip whiteb spaces
       while(i<n && s.charAt(i)==' '){
        i++;
       }

       //sign convert
       int sign=1;
       if(i<n && s.charAt(i)=='-'){
        sign=-1;
        i++;
       }else if(i<n && s.charAt(i)=='+'){
        i++;
       }

       //convert string to int
       long num=0;
       while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
         int digit=s.charAt(i)-'0';
         num=num*10+digit;

         if(sign==1 && num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
         }else if(sign==-1 && -num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
         }
         i++;//else skip
       }
        return (int)(sign*num);
    }
}