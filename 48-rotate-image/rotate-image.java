class Solution {
    public void swap(int matrix[][],int i,int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }

    public void reverse(int row[]){
        int l=0,h=row.length-1;
        while(l<=h){
            int temp=row[l];
            row[l]=row[h];
            row[h]=temp;
            l++;
            h--;
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