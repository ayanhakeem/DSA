class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.add(nums[i-1]);//0 idx so i-1
            }
        }
        int sum=0;
        for(int i:ans){
            sum+=i*i;
        }
        return sum;
        
    }
}