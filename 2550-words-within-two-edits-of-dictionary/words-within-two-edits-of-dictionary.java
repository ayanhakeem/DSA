class Solution {
    public static boolean canedit(String a,String b){
        int diff = 0;
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
            if (diff > 2) return false;
        }
        
        return true;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                if(canedit(queries[i],dictionary[j])){
                    ans.add(queries[i]);
                    break;
                }
            }
        }
        return ans;
    }
}