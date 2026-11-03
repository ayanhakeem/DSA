class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int sum=0;
        for(int i:nums){
            sum+=Math.abs(i-max);
        }
        return sum;
    }
}