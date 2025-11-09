class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums); // Sort ascending
        int totalsum=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int sum=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            ans.add(nums[i]);
            if(sum>totalsum-sum){
                break;
            }
        }

        return ans;
        
    }
}