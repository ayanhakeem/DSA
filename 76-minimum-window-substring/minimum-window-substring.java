// class Solution {
//     public String minWindow(String s, String t) {
//         Map<Character,Integer>targetfreq=new HashMap<>();
//         for(char c:t.toCharArray()){
//             targetfreq.put(c,targetfreq.getOrDefault(c,0)+1);
//         }

//         int l=0,r=0;
//         int minlen=Integer.MAX_VALUE;
//         int formed=0;
//         int required=targetfreq.size();
//         int minleft=0;

//         Map<Character,Integer>windowfreq=new HashMap<>();


//         while(r<s.length()){
//             char c=s.charAt(r);
//             windowfreq.put(c, windowfreq.getOrDefault(c, 0) + 1);
//             if(targetfreq.containsKey(c) && targetfreq.get(c).intValue()==windowfreq.get(c).intValue()){
//                 formed++;
//             }
//             while(l<=r && formed==required){
//                 if((r-l+1)<minlen){
//                     minlen=r-l+1;
//                     minleft=l;
//                 }

//                 char leftchar=s.charAt(l);
//                 windowfreq.put(leftchar,windowfreq.get(leftchar)-1);
//                 if (targetfreq.containsKey(leftchar) && windowfreq.get(leftchar) < targetfreq.get(leftchar)) {
//                     formed--;
//                 }

//                 l++;

//             }
//             r++;
//         }
//         return minlen == Integer.MAX_VALUE ? "" : s.substring(minleft, minleft + minlen);
//     }
// }

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) {//o(t.length)
            need[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {//o(s.length)
            char c = s.charAt(right);

            if (need[c] > 0) required--;
            need[c]--;
            right++;

            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;
                if (need[leftChar] > 0) required++;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" 
                                           : s.substring(start, start + minLen);
    }
}
//tc=o(n
//sc=o(1)
