class Solution {
    private List<String>res=new ArrayList<>();
    private String[] digittochar={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",
    };
    public void dfs(int i,String currstr,String digits){
        if(currstr.length()==digits.length()){
            res.add(currstr);
            return;
        }
        String str=digittochar[digits.charAt(i)-'0'];//abc
        for(char c:str.toCharArray()){
            dfs(i+1,currstr+c,digits);
        }



    }

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        dfs(0,"",digits);
        return res;
    }
}