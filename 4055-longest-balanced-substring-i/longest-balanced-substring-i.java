class Solution {
    public boolean isequal(int arr[],int temp){
        for(int i:arr){
            if(i>0 && i!=temp) return false;//if same freq cnt is not there in freq array return false
        }
        return true;
    }
    public int longestBalanced(String s) {
        char ch[]=s.toCharArray();
        int res=0;
        for(int i=0;i<ch.length;i++){
            int freq[]=new int[26];
            for(int j=i;j<ch.length;j++){
                freq[ch[j]-'a']++;
                int tempfreq=freq[ch[j]-'a'];//last char freq to check prev all non zero freq have same number of count
                if(isequal(freq,tempfreq)){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;

        
    }
}