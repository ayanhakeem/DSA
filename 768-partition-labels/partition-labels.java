class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>ans=new ArrayList<>();
        int n=s.length();
        int last[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            last[ch-'a']=i;
        }

        int i=0;
        int st=0;
        int end=0;
        while(i<n){
            end=Math.max(end,last[s.charAt(i)-'a']);
            if(i==end){
                ans.add(end-st+1);
                st=end+1;
            }
            i++;
        }
        return ans;
        
    }
}
//2 pointer approach //tc=o(n) and sc=o(26)