class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        int n=s.length();
        int len=0;
        st.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                if(!st.isEmpty()){
                    st.pop();//if')' pop'
                }
                if(!st.isEmpty()){//afer pop still st is on empty
                    len=Math.max(len,i-st.peek());//ipdate len
                }else{
                    st.push(i);//if st si empty push
                }

            }
        }
        return len;
        
    }
}
//tc=o(n)
//sc=o(n)