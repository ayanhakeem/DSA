class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            String w=words[i];
            for(char c:w.toCharArray()){
                if(c==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}