// //sorting and comparing
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//        char s1arr[]=s1.toCharArray();
//        Arrays.sort(s1arr);
//        String sorteds1=new String(s1arr);
//        for(int i=0;i<s2.length();i++){
//         for(int j=i;j<s2.length();j++){
//             char substr[]=s2.substring(i,j+1).toCharArray();
//             Arrays.sort(substr);
//             String sortedsubstrs2=new String(substr);
//             if(sortedsubstrs2.equals(sorteds1)){
//                 return true;
//             }
//         }
//        }
//        return false;
//     }
// }

//hashmap
// public class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         Map<Character, Integer> count1 = new HashMap<>();
//         for (char c : s1.toCharArray()) {
//             count1.put(c, count1.getOrDefault(c, 0) + 1);
//         }

//         int need = count1.size();
//         for (int i = 0; i < s2.length(); i++) {
//             Map<Character, Integer> count2 = new HashMap<>();
//             int cur = 0;
//             for (int j = i; j < s2.length(); j++) {
//                 char c = s2.charAt(j);
//                 count2.put(c, count2.getOrDefault(c, 0) + 1);

//                 if (count1.getOrDefault(c, 0) < count2.get(c)) {
//                     break;
//                 }

//                 if (count1.getOrDefault(c, 0) == count2.get(c)) {
//                     cur++;
//                 }

//                 if (cur == need) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

        if(n1>n2) return false;
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<n1;i++){//freq of s1 and 1st window of s2 of s1 size same
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)) return true;//if 1st windoow of s2 and s1 freq array values at same idx same then return true
        //else st from n1 length bcoz we have to traverse from 2nd window in s2
        //and update only c2 freq array 
        //while moving add new char into c2 and remove char from left in s2
        for(int i=n1;i<n2;i++){
            c2[s2.charAt(i)-'a']++;///right++
            c2[s2.charAt(i-n1)-'a']--;//left--

            if(Arrays.equals(c1,c2)) return true;
        }

        return false;
    }
}