class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        int n=s.length();
        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;//skip spaces
            }
            if(i<0) break;//out of bounds
            int end=i;//mark end os word

            while(i>=0 && s.charAt(i)!=' '){//move left until space found
                i--;
            }
            String word=s.substring(i+1,end+1);
            if(res.length()>0){
                res.append(" ");//add space after each word if res >0 if res=0 dont add else it will leads to space before starting word
            }
            res.append(word);
        }
        return res.toString();
    }
}
//tc=o(n)
//sc=o(n)