class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;

        int i=n-1;
        long tot=0;
        int usedk=k;
        while(i>=0 && usedk>0 && mul>0){
            long sum=1L*nums[i]*mul;
            mul--;
            usedk--;
            tot+=sum;
            i--;
        }
        int lastposofi=i;
        int remaink=usedk;
        while(lastposofi>=0 && remaink>0){
            tot+=nums[lastposofi];
            lastposofi--;
            remaink--;
        }
        
        return tot;
    }
}