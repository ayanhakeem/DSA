class Solution {
    public boolean detectCapitalUse(String word) {
        char arr[]=word.toCharArray();
        int n=arr.length;
        int cc=0;
        int sc=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                cc++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(Character.isLowerCase(arr[i])){
                sc++;
            }
        }
        if(Character.isUpperCase(arr[0]) && sc==n-1) return true;
        if(cc==n || sc==n) return true;
        return false; 
    }
}


// class Solution {
//     public boolean detectCapitalUse(String word) {
//         int n=word.length();
//         if(word.equals(word.toUpperCase())) return true; 
//         if(word.equals(word.toLowerCase())) return true;
//         if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) return true;
//         return false;
//     }
// }

// //tc=o(n)
// //sc=o(n)