class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int bp=prices[0];
        int p=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(prices[i]<bp){
                bp=prices[i];
            }else{
                p=prices[i]-bp;
                max=Math.max(max,p);
            }
        }
        return (max==Integer.MIN_VALUE?0:max);
    }
}