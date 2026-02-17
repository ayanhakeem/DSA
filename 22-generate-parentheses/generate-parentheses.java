class Solution {
    public void helper(List<String>ans,int opencount,int closecount,String s,int n){
        //base case
        if(opencount==n && closecount==n){
            ans.add(s);
        }
        if(opencount>closecount){
            helper(ans,opencount,closecount+1,s+")",n);
        }if(opencount<n){
            helper(ans,opencount+1,closecount,s+"(",n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        String s="";
        helper(ans,0,0,s,n);
        return ans;
        
    }
}