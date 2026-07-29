class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int maxfreq=0;
        int ans=-1;
        for(int k:map.keySet()){
            int freq=map.get(k);
            if(freq>maxfreq){
                maxfreq=freq;
                ans=k;
            }else if(maxfreq==freq){
                ans=Math.min(k,ans);
            }
        }
        return ans;
    }
}