class Solution {
    public long removeZeros(long n) {
        long result = 0;
        long multiplier = 1;
        while (n > 0) {
            long digit = n % 10;
            n /= 10;
            if(digit != 0) {
                result = digit * multiplier + result;
                multiplier *= 10;
            }
        }
        return result;
    }
    
}
















// class Solution {
//     public long removeZeros(long n) {
//         String s=String.valueOf(n);
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='0'){
//                 continue;
//             }else{
//                 sb.append(s.charAt(i));
//             }
//         }
//         return  Long.parseLong(sb.toString());
        
//     }
// }