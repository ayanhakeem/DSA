class Solution {
    public boolean checkRecord(String s) {
        int cntA = 0;
        int cntL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                cntA++;
                cntL = 0;   // break L streak
            } else if (s.charAt(i) == 'L') {
                cntL++;
            } else {
                cntL = 0;   // 'P' breaks L streak
            }

            if (cntA >= 2 || cntL >= 3) {
                return false;
            }
        }

        return true;
    }
}
// class Solution {
//     public boolean checkRecord(String s) {
//         int n=s.length();
//         int cnta=0;
//         for(int i=0;i<n;i++){
//             if(s.charAt(i)=='A'){
//                 cnta++;
//             }
//         }
//         int cntl=1;
//         int max=1;
//         for(int i=1;i<n;i++){
//             if(s.charAt(i-1)=='L' && s.charAt(i)=='L'){
//                 cntl++;
//                 max=Math.max(cntl,max);
//             }else{
//                 cntl=1;
//             }
//         }
//         if(cnta<2 && max<3) return true;
//         return false;
//     }
// }
// llall
// cntl=2 then reset cnt=1;

//tc=o(n)+o(n)
//sc=o(1)