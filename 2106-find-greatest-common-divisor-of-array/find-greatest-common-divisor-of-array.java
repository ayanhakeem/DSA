class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int smallest=nums[0];
        int largest=nums[n-1];
        int result=Math.min(smallest,largest);
        while(result>0){
            if(smallest%result==0 && largest%result==0){
                break;
            }
            result--;
        }
        return result;
        
    }
}