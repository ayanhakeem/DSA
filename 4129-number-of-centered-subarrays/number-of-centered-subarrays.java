class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer>map=new HashMap<>();
            int sum=0;
            for(int j=i;j<n;j++){
               sum+=nums[j];
               map.put(nums[j],map.getOrDefault(nums[j],0)+1);
               if(map.containsKey(sum)){
                 cnt++;
               } 
            }
        }
        return cnt;
        
    }
}