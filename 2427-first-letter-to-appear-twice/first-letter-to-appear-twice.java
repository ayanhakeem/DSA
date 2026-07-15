class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }else{
                set.add(s.charAt(i));
            }
        }
        return '\0';
    }
}

// class Solution {
//     public char repeatedCharacter(String s) {
//         int hash[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             hash[s.charAt(i)-'a']++;
//         }

//         for(int i=0;i<s.length();i++){
//             if(hash[s.charAt(i)-'a']==2){
//                 return s.charAt(i);
//             }
//         }
//         return s.charAt(i);
//     }
// }