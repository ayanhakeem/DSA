class Solution {
    public int minimumCost(int[] cost) {
       int n=cost.length; 
       Arrays.sort(cost);
       int sum=0,cnt=0;
       for(int i=n-1;i>=0;i--){
        sum+=cost[i];
        cnt++;
        if(cnt==2){
            i=i-1;
            cnt=0;
        }
       }
       return sum;
    }
}