class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int totxor=0;
        for(int i:nums){
            totxor=totxor^i;
        }
        
        if(totxor!=0){
            return n;
        }
        boolean check=true;
        for(int j:nums){
            if(j!=0){
                check=false;
                break;
            }
        }
        if(check){
            return 0;
        }

        return n-1;
        
    }
}