class Solution {
    public int lengthOfLongestSubstring(String s) {
            
        int[] hash = new int[256];
        
        
        Arrays.fill(hash, -1);
        
        
        int n = s.length();
        
        
        int l = 0, r = 0;
        
        
        int maxLen = 0;
        
      
        while (r < n) {
            
            if (hash[s.charAt(r)] != -1) {
                
                if (hash[s.charAt(r)] >= l) {//the prev/last occurence of curr shoulb be within tange(l-r) means >=l not beyond
                    
                    l = hash[s.charAt(r)] + 1;
                }
            }
            
          
            int len = r - l + 1;
            
        
            maxLen = Math.max(len, maxLen);
            
          
            hash[s.charAt(r)] = r;
            
            r++;
        }
     
        return maxLen;
    
    }
}

//tc=o(n)
//sc=o(256)

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n=s.length();
//         Map<Character,Integer>map=new HashMap<>();
//         int cnt=0;
//         for(int i=0;i<n;i++){
//             if(!map.containsKey(s.charAt(i))){
//                 map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
// }