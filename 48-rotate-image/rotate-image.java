class Solution {
    public void swap(int mat[][],int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }

    public void reverse(int row[]){
        int n=row.length;
        int l=0,r=n-1;
        while(l<r){
            int temp=row[l];
            row[l]=row[r];
            row[r]=temp;
            l++;
            r--;
        }

    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }

        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }

    }
}