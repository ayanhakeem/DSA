class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            String curr=tokens[i];
            if(curr.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(curr.equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }else if(curr.equals("*")){
                st.push(st.pop()*st.pop());
            }else if(curr.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }else{
                int num=Integer.parseInt(curr);
                st.push(num);
            }
            
        }
        return st.peek();
    }
}