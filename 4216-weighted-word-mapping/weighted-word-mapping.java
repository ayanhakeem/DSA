class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            int j=0;
            while(j<s.length()){
                sum+=weights[s.charAt(j)-'a'];
                j++;
            }
            int mod=sum%26;
            sb.append((char)('z'-mod));

        }
        
       
        return sb.toString();
        
    }
}