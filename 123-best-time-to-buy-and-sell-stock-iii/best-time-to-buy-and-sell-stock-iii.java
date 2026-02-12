class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int prefixmax[]=new int[n];
        int min=prices[0];

        prefixmax[0]=0;
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            prefixmax[i]=Math.max(prefixmax[i-1],prices[i]-min);
        }

        int suffixmax[]=new int[n];
        suffixmax[n-1]=0;
        int max=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            suffixmax[i]=Math.max(suffixmax[i+1],max-prices[i]);
        }

        int maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=prefixmax[i]+suffixmax[i];
            maxprofit=Math.max(maxprofit,sum);
        }

        return maxprofit;
        
    }
}