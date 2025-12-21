class Solution {
    public long minCost(String s, int[] cost) {
        int n=cost.length;
        long arr[]=new long[26];
        long sum=0,max=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=cost[i];
            max=Math.max(arr[s.charAt(i)-'a'],max);
            sum+=cost[i];
        }

        return sum-max;
        

    }
}