class Solution {
    public int numberOfSpecialChars(String word) {

        boolean lower[] = new boolean[26];
        boolean upperSeen[] = new boolean[26];
        boolean special[] = new boolean[26];

        int cnt = 0;

        for(char c : word.toCharArray()) {

            if(Character.isLowerCase(c)) {
                int idx = c - 'a';

                // lowercase after first uppercase → invalidate
                if(upperSeen[idx] && special[idx]) {
                    special[idx] = false;
                    cnt--;
                }

                lower[idx] = true;
            }
            else {
                int idx = c - 'A';

                // mark first uppercase
                if(!upperSeen[idx]) {
                    upperSeen[idx] = true;

                    if(lower[idx]) {
                        special[idx] = true;
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}



//my approach-not worked wrong answer
// class Solution {
//     public int numberOfSpecialChars(String word) {
//        int n=word.length();
//        boolean hash[]=new boolean[26];
//        Stack<Character>st=new Stack<>();
//        int cnt=0;
//        for(int i=0;i<n;i++){
//         char c=word.charAt(i);
//         if(Character.isUpperCase(c)){
//             int idx=c-'A';
//             if(st.contains(Character.toLowerCase(c)) && !hash[idx]){
//                 hash[idx]=true;
//                 cnt++;
//             }
        
//         }else{
//             int idx=c-'a';
//             if(st.contains(Character.toUpperCase(c)) && hash[idx]==true){
//                 hash[idx]=false;
//                 cnt--;
//             }
//         }
//         st.push(c);
//        } 
//        return cnt;
//     }
// }