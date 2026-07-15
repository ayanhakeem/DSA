class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int n=nums.length;
        Set<Integer>set=new HashSet<>();
        int sum=0,max=0;
        for(int j=0;j<n;j++){
            if(set.contains(nums[j])){
                while(set.contains(nums[j])){
                    set.remove(nums[i]);
                    sum-=nums[i];
                    i++;
                }
                set.add(nums[j]);
                sum+=nums[j];
                max=Math.max(max,sum);
            }else{
                set.add(nums[j]);
                sum+=nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}