class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
        }

        int cnt=0;

        for(int i:nums){
            cnt+=i-min;
        }

        return cnt;
    }
}