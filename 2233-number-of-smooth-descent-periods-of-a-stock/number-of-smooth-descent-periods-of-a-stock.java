class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long tot=1;
        long desstreak=1;
        for(int i=1;i<n;i++){
            if(prices[i-1]-prices[i]==1){
                desstreak++;
            }else{
                desstreak=1;
            }
            tot+=desstreak;
        }
        return tot;
        
    }
}