class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==2){
                ans.add(i);
            }
        }
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}