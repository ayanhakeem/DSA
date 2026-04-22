class Solution {
    public static boolean canedit(String a,String b){
        int diff = 0;
        
        for (int i = 0; i < a.length(); i++) {//o(n)
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
                    break;//avoid dublicates
                }
            }
        }
        return ans;
    }
}
//tc=o(n3)
//sc=o(n)