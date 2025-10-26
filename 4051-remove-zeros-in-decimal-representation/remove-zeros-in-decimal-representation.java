class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return  Long.parseLong(sb.toString());
        
    }
}