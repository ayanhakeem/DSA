class Solution {
    public int numSteps(String s) {
        int carry=0;
        int steps=0;
        int n=s.length();

        for(int i=n-1;i>0;i--){
            int bit=s.charAt(i)-'0';//gives curent bit means if 0 gives 0 or 1 gives 1
            if(bit+carry==1){//if last bit is odd steps 2 means odd then add 1 then it becomes 2 even then divide by 2 total 2 operations
                steps+=2;
                carry=1;
            }else{
                steps+=1;//if even 1 step divide by 2 only
            }
        }
        return steps+carry;
        
    }
}