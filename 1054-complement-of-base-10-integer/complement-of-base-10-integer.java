class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int mask=1;
        while(mask<n){
            mask=(mask<<1)|1;

        }
        return mask^n;
    }
}



//brute force
// class Solution {
//     public int bitwiseComplement(int n) {
//         if(n==0) return 1;
//        String s = Integer.toBinaryString(n);//o(logn)
       
//        StringBuilder sb=new StringBuilder();//o(logn)
//        for(int i=0;i<s.length();i++){//o(logn)
//         if(s.charAt(i)=='0'){
//             sb.append('1');
//         }else{
//             sb.append('0');
//         }
//        }
//        int num = Integer.parseInt(sb.toString(), 2);//o(logn)
//        return num;
//     }
// }