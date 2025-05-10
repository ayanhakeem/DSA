class Solution {
    public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;//min
        int mp=0;
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit=prices[i]-bp;
                mp=Math.max(profit,mp);
            }else{
                bp=prices[i];
            }
        }
        return mp;
           
    }
}