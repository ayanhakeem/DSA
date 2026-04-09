class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
         if(Character.isDigit(s.charAt(0))){
            st.push(s.charAt(0));
        }
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(s.charAt(i));
            }
           
        }

    
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}