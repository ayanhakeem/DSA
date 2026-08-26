class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i[]:grid){
            for(int j:i){
                ans.add(j);
            }
        }
        int res[]=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<ans.size();i++){
            map.put(ans.get(i),map.getOrDefault(ans.get(i),0)+1);
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!map.containsKey(i)){
                res[1]=i;
            }
            else if(map.get(i)==2){
                res[0]=i;
            }
        }
        return res;
    }
}