class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String>map=new HashMap<>();
        String arr[]=s.trim().split("\\s+");
        if (pattern.length() != arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){//if map contains ch already
                if(!map.get(ch).equals(arr[i])){///not maps to same word as curr word return false;
                    return false;
                }
            }
            else{
                if(map.containsValue(arr[i])) return false;//map contais already that word for diff char     
                map.put(ch,arr[i]);
            }
        }
        return true;
    }
}
    