class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(set.contains(i)){
                continue;
            }else{
                ans.add(i);
            }
        }
        return ans;

        
    }
}