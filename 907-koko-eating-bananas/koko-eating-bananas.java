class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }

        int st=1,end=max;
        int res=end;
        while(st<=end){
            int k=(st+end)/2;
            long tottime=0;
            for(int p:piles){
                tottime += Math.ceil((double) p / k);
            }
            if(tottime<=h){
                res=k;
                end=k-1;
            }else{
                st=k+1;
            }
        }
        return res;
    }
}