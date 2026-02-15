class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer>map1=new HashMap<>();
        Map<Integer,Integer>map2=new HashMap<>();
        for(int i:nums){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }

        for(int i:map1.values()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            int freq=map1.get(nums[i]);
            if(map2.get(freq)==1){
                return nums[i];
            }

        }
        return -1;
        
    }
}