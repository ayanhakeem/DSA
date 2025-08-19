class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt=0;
        int ps=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);//initial put 0 with cnt=1
        for(int i=0;i<n;i++){
            ps+=nums[i];
            int rem=ps-k;
            cnt += map.getOrDefault(rem, 0);

            map.put(ps, map.getOrDefault(ps, 0) + 1);
        }
        return cnt;     
    }
}

//tc=o(n)
//sc=o(n) in wc every presum is unique