class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int bp=prices[0];
        int p=0;
        int maxp=INT_MIN;
        for(int i=1;i<n;i++){
            if(prices[i]<bp){
                bp=prices[i];
            }else{
                p=prices[i]-bp;
                maxp=max(maxp,p);
            }
        }
        return (maxp==INT_MIN?0:maxp);
    }
};