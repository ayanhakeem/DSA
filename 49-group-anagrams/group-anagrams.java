class Solution {//optimized
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            int[] count = new int[26]; // frequency count
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Build unique key from count array
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#"); // delimiter
                sb.append(count[i]);
            }
            String key = sb.toString();
            
            // Group words
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}

/*Time Complexity: O(N * L)
Space Complexity: O(N * L)
*/





/*brute fore
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();//sorted str,arraylist
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char temp[]=strs[i].toCharArray();//convert to char array
            Arrays.sort(temp);//sort temp arr
            String s=String.valueOf(temp);//again convert to string
            if(map.get(s)!=null){//alredy in map
                List<String>a=map.get(s);//get arraylsit
                a.add(strs[i]);//add in arraylist
                map.put(s,a);//update map
            }else{
                List<String>a=new ArrayList<>();
                a.add(strs[i]);
                map.put(s,a);
            }
        }
        for(Map.Entry<String,List<String>>x:map.entrySet()){//iterate on map entry set means <key,value> pairs get value of x
            ans.add(x.getValue());
        }
        return ans;
    }
}
//tc=o(n*l log l)for n string o(l) for to convert array and log l for sort 
//sc=o(n*l) */