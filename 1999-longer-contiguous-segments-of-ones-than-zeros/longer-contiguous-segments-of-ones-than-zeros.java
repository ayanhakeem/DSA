class Solution {
    public boolean checkZeroOnes(String s) {
        int cnt0=0,cnt1=0;
        int max0=0,max1=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                cnt0++;
                max0=Math.max(max0,cnt0);
                cnt1=0;
            }else{
                cnt1++;
                max1=Math.max(max1,cnt1);
                cnt0=0;
            }
        }
        

        return max1>max0;
    }
}

//tc=o(n)
//sc=o(1)