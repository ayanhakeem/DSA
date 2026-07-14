class Solution {
    public String capitalizeTitle(String title) {
        int n=title.length();
        String word[]=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length;i++){
            String w=word[i];
            if(w.length()<=2){
                sb.append(w.toLowerCase());
            }else{
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1).toLowerCase());
            }
            if(i!=word.length-1){
                sb.append(" ");
            }


        }
        return sb.toString();
    }
}