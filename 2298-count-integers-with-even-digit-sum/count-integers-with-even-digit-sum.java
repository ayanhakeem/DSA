class Solution {
    private boolean digiteven(int n){
        int cnt=0;
        while(n!=0){
            int ld=n%10;
            cnt+=ld;
            n/=10;
        }
        return cnt%2==0;
    }
    public int countEven(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(digiteven(i)){
                cnt++;
            }
        }
        return cnt;
    }
}