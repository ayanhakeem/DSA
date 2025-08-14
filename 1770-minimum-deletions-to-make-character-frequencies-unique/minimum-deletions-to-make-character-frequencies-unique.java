class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer>map=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        for(char c : s.toCharArray()){//o(n)
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int d=0;
        for(int i:map.values()){
            while(set.contains(i) && i>0){
                i=i-1;
                d=d+1;
            }
            if(i>0){//we have entirely deleted char we dont need 0 freq only postive
                set.add(i);
            }
        }
        return d;
    }
}
//tc=o(n)
//sc=o(n)