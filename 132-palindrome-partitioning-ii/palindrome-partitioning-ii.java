class Solution {
    public boolean isPalindrome(String s,int st,int end){
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }

    // public int func(String s,int start,int dp[]){
    //     int n=s.length();
    //     if(start==n || isPalindrome(s,start,n-1)) return 0;//base case
    //     int mincuts=Integer.MAX_VALUE;

    //     if(dp[start]!=-1) return dp[start];

    //     for(int end=start;end<n;end++){
    //         if(isPalindrome(s,start,end)){
    //             int cuts=1+func(s,end+1,dp);
    //             mincuts=Math.min(mincuts,cuts);
    //         }
    //     }
    //     return dp[start]=mincuts;
    // }

    public int func(String s){
        int n=s.length();
        
        int dp[]=new int[n+1];

        dp[n]=-1;//no cuts for last index of string

        for(int i=n-1;i>=0;i--){
            int mincuts=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    int cuts=1+dp[j+1];//current cut + further cuts needed forafter j
                    mincuts=Math.min(mincuts,cuts);
                }
            }
            dp[i]=mincuts;
        }

        return dp[0];


       
    }


    public int minCut(String s) {       
        return func(s);
    }
}