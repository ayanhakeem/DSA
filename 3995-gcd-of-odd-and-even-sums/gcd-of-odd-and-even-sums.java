class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum=n*(n+1);
        int oddsum=n*n;
        
        int a=evensum;
        int b=oddsum;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
        
    }
}