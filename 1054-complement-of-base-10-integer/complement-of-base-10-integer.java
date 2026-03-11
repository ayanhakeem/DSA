class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
       String s = Integer.toBinaryString(n);
       
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            sb.append('1');
        }else{
            sb.append('0');
        }
       }
       int num = Integer.parseInt(sb.toString(), 2);
       return num;
    }
}