class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0) return false;
        int gps=n/k;
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i:map.values()){
            if(i>gps) return false;
        }
        return true;


        
    }
}