class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer>map1=new HashMap<>();
        Map<Integer,Integer>map2=new HashMap<>();
        for(int i:nums1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(map1.containsKey(i)){
                min=Math.min(min,i);
            }
        }
        
        return (min!=Integer.MAX_VALUE?min:-1);
    }
}