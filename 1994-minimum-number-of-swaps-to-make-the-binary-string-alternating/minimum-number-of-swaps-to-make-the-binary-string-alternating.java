class Solution {
    public int minSwaps(String s) {
        int cnt1=0,cnt0=0,miss0=0,miss1=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') cnt1++;
            else cnt0++;
        }
        if(Math.abs(cnt1-cnt0)>1) return -1;//in odd length abs<=1 means alternate string possible means majoruty ele must start with 1 and end with 1
        for(int i=0;i<n;i+=2){//alternate idx check miss0 and miss1
            if(s.charAt(i)!='0'){
                miss0++;
            }else{
                miss1++;
            }
        }
        return cnt0==cnt1?Math.min(miss0,miss1):cnt0>cnt1?miss0:miss1;//swaps needed 
       
    }
}
//tc=o(n)+o(n/2)==o(n)
//sc=o(1)