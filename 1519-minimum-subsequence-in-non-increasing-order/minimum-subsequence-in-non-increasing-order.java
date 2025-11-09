class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums); // Sort ascending

        // To get descending manually:
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        int totalsum=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int sum=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>totalsum-sum){
                int j=0;
                while(j<=i){
                    ans.add(nums[j]);
                    j++;
                }
                break;
            }
        }

        return ans;
        
    }
}