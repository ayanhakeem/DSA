class Solution {
    public boolean isPalindrome(String s,int st,int end){
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }

    public int func(String s,int start,int dp[]){
        int n=s.length();
        if(start==n || isPalindrome(s,start,n-1)) return 0;//base case
        int mincuts=Integer.MAX_VALUE;

        if(dp[start]!=-1) return dp[start];

        for(int end=start;end<n;end++){
            if(isPalindrome(s,start,end)){
                int cuts=1+func(s,end+1,dp);
                mincuts=Math.min(mincuts,cuts);
            }
        }
        return dp[start]=mincuts;



    }
    public int minCut(String s) {
        int n=s.length();        
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return func(s,0,dp);
    }
}