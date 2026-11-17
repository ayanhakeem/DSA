class Solution {
    public static boolean allequal(int hash[]){
        int freq = 0;

        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) continue;

            if (freq == 0) {
                freq = hash[i];
            } else if (freq != hash[i]) {
                return false;
            }
        }

        return true;
    }
    public boolean equalFrequency(String word) {
        int hash[]=new int[26];
        int n=word.length();
        for(int i=0;i<word.length();i++){
            hash[word.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(hash[i]==0) continue;
            hash[i]--;
            if(allequal(hash)){
                return true;
            }
            hash[i]++;
        }
        return false;
    }
}

// import java.util.*;

// class Solution {
//     public boolean equalFrequency(String word) {
//         for (int i = 0; i < word.length(); i++) {//o(n) tc
//             Map<Character, Integer> freqMap = new HashMap<>();//o(1) sc
            
//             // Count frequencies excluding the i-th character exclude ith char
//             for (int j = 0; j < word.length(); j++) { //o(n)
//                 if (j == i) continue;
//                 char c = word.charAt(j);
//                 freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//             }
            
//             // Check if all frequencies are equal
//             Set<Integer> freqSet = new HashSet<>(freqMap.values());
//             if (freqSet.size() == 1) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
//tc=o(n2)
//sc=o(1)