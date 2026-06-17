class Solution {
    public String processStr(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='*'){
                if(sb.length()>=1){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else if(c=='#'){
                sb.append(sb.toString());
            }else if(c=='%'){
                sb.reverse();
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}