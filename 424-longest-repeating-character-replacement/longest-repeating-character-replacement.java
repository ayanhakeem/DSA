class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int n=s.length();
        int res=0;
        int maxf=0;
        int l=0;
        for(int r=0;r<n;r++){
            freq[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(r)-'A']);

            while((r-l+1)-maxf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
//tc=o(n)
//sc=o(n)

// class Solution {
//     public int characterReplacement(String s, int k) {
//         HashSet<Character>set=new HashSet<>();
//         for(char c:s.toCharArray()){
//             set.add(c);
//         }
//         int res=0;
//         int n=s.length();
//         for(char c:set){
//             int cnt=0;
//             int l=0;
//             for(int r=0;r<n;r++){
//                 if(s.charAt(r)==c){
//                     cnt++;
//                 }
//                 while((r-l+1)-cnt>k){
//                     if(s.charAt(l)==c){
//                         cnt--;
//                     }
//                     l++;
//                 }
//                 res=Math.max(res,r-l+1);
//             }
//         }
//         return res;
//     }
// }

//tc=o(m*n)
//sc=o(n)


//brute force
// class Solution {
//     public int characterReplacement(String s, int k) {
//         int n=s.length();
//         int res=0;
//         for(int i=0;i<n;i++){
//             Map<Character,Integer>cntmap=new HashMap<>();
//             int maxf=0;
//             for(int j=i;j<n;j++){
//                 cntmap.put(s.charAt(j),cntmap.getOrDefault(s.charAt(j),0)+1);
//                 maxf=Math.max(maxf,cntmap.get(s.charAt(j)));
//                 if((j-i+1)-maxf<=k){
//                     res=Math.max(res,j-i+1);
//                 }
//             }
//         }
//         return res;
//     }
// }

//tc=o(n2)
//sc=o(n)