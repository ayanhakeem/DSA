class Solution {

    public boolean isValid(int x){
        boolean changed=false;
        while(x!=0){
            int ld=x%10;
            if(ld==3 || ld==4 || ld==7){
                return false;
            }
            if(ld==2 || ld==5 || ld==6 || ld==9){
                changed=true;
            }

            x=x/10;
        }

        return changed;
    }
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(isValid(i)) cnt++;
        }

        return cnt;
    }
}