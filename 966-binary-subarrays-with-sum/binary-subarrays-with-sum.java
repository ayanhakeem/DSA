class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       int cnt=0,currsum=0;
       for(int i:nums){
        currsum+=i;
        int rem=currsum-goal;
        cnt += map.getOrDefault(rem, 0);
        map.put(currsum, map.getOrDefault(currsum, 0) + 1);
       }
       return cnt;
    }
}