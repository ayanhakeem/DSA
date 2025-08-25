class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n=security.length;
        int cnt=0;
        int prefix[]=new int[n];//for how many ele are decresing order in left
        int suffix[]=new int[n];//how many ele are incresinfg order in right
        //prefix
        for(int i=1;i<n;i++){
            if(security[i]<=security[i-1]){
                cnt++;
            }else{
                cnt=0;//if any where cond fails cnt=0 reinitialize means no elements are there
            }
            prefix[i]=cnt;
        }
        //suffix 
        cnt=0;
        for(int i=n-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                cnt++;
            }else{
                cnt=0;
            }
            suffix[i]=cnt;
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(prefix[i]>=time && suffix[i]>=time){
                ans.add(i);
            }
        }
        return ans;
    }
}
//tc=o(2n)+o(n)
//sc=o(2n)