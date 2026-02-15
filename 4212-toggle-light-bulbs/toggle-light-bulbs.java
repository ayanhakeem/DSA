class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }


        List<Integer>ans=new ArrayList<>();

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()%2==1){
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        return ans;     
    }
}