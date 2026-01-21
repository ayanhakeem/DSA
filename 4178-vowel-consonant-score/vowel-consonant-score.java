class Solution {
    public int vowelConsonantScore(String s) {
        int n=s.length();
        int c=0;
        int v=0;
        int score=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }else if(Character.isDigit(ch) || ch==' '){
                continue;
            }else{
                c++;
            }
        }
        if(c>0){
            score=v/c;
        }else{
            score=0;
        }

        return score;
        
    }
}