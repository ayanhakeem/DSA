class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int n=s.length();
        if(n==0) return new int[]{0,0};
        int sum=0;
        int stop=100; 
        int ans[]=new int[]{1,0};
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int temp=widths[ch-'a'];
            if(temp+sum<=100){
                sum+=temp;
            }else{
                ans[0]++;//line increses
                sum=temp;//assins temp to sum
            }
        }
        ans[1]=sum;//store the sum in 1st idx
        
        return ans;
    }
}