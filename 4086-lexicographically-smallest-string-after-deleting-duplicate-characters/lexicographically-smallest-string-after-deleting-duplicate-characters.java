class Solution {
    public String lexSmallestAfterDeletion(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }//track frequency o(n)

        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){//o(n) if charc appears twice again later and curr char is smaller than prev then pop/remove prev and decrese the freq count
            while(!st.isEmpty() && st.peek()>s.charAt(i) && map.get(st.peek())>1){
                map.put(st.peek(),map.get(st.peek())-1);
                st.pop();
            }
            
            st.push(s.charAt(i));

        }

        while(!st.isEmpty() && map.get(st.peek())>1){
            map.put(st.peek(),map.get(st.peek())-1);
            st.pop();//extra remaining char pop means twice appears pop
        }

        StringBuilder answer=new StringBuilder();
        while(!st.isEmpty()){
            answer.append(st.pop());
        }

        return answer.reverse().toString();
    

    }
}
//tc=o(n)
//sc=o(n)