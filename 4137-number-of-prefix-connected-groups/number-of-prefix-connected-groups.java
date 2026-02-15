class Solution {
    public int prefixConnected(String[] words, int k) { 
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.length()<k) continue;
            int j=0;
            StringBuilder sb=new StringBuilder();
            while(j<k){ 
                sb.append(s.charAt(j));
                j++;
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        int cnt=0;
        for(int i:map.values()){
            if(i>=2){
                cnt++;
            }
        }
        return cnt;
        
    }
}