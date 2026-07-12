class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int a=1;a<n;a++){
            for(int b=a+1;b<n;b++){
                for(int c=b+1;c<=n;c++){
                    if(a*a+b*b==c*c){
                        cnt=cnt+2;
                    }
                }
            }
        }
        return cnt;
    }
}