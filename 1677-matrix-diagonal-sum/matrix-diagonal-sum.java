class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];

            if(i!=n-i-1){//if i!=j means its not calculated by above condition
                sum+=mat[i][n-i-1];//i+j=n-1=>j=n-1-i
            }
        }
        return  sum;
        
    }
}

//tc=o(n)
//sc=o(1)