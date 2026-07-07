class Solution {
    public long sumAndMultiply(int n) {
        Stack<Integer>st=new Stack<>();
        long sum=0;
        while(n>0){
            int ld=n%10;
            if(ld!=0){
                st.push(ld);
                sum+=ld;
            }

            n/=10;
        }

        long res=0;
        while(!st.isEmpty()){
            res=st.pop()+res*10;
        }

        return res*sum;


    }
}