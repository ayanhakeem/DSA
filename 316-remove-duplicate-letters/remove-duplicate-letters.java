class Solution {
    public String removeDuplicateLetters(String s) {
        int lastidx[]=new int[26];
        for(int i=0;i<s.length();i++){
            lastidx[s.charAt(i)-'a']=i;
        }

        Stack<Character>st=new Stack<>();
        boolean vis[]=new boolean[26];

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(vis[curr-'a']==true) continue;
            while(!st.isEmpty() && st.peek()>curr && lastidx[st.peek()-'a']>i){
                char removed=st.pop();
                vis[removed-'a']=false;
            }
            st.push(curr);
            vis[curr-'a']=true;
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : st){
            sb.append(ch);
        }

        return sb.toString();



    }
}