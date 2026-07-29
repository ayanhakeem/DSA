class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[nums.length];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getKey()<nums[i]){
                    cnt+=entry.getValue();
                }
            }
            ans[i]=cnt;
        }
        return ans;
        
    }
}