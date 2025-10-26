class Solution {
    public long removeZeros(long n) {
        Stack<Long>stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        while(n>0){
            long lastdigit=n%10;
            n=n/10;
            if(lastdigit==0){
                continue;

            }else{
                stack.push(lastdigit);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return Long.parseLong(sb.toString());
        
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