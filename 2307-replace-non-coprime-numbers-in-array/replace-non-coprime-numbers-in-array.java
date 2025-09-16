class Solution {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);//euclid's recursion methodo  o(min(a,b))
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int n:nums){//o(2*n)
            while(!ans.isEmpty()){
                int prev=ans.get(ans.size()-1);//last ele in ans
                int curr=n;
                int g=gcd(prev,curr);
                if(g==1){
                    break;
                }
                ans.remove(ans.size()-1);//gcd>1 remove and merge
                long lcm=(long)prev/g*n;
                n=(int)lcm;//merged num
            }
            ans.add(n);
        }
        return ans;
        
    }
}
//tc=o(min(a,b))+o(2*n)
//sc=o(1)