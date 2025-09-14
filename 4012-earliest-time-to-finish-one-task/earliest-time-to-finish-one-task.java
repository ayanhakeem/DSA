class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int st=tasks[i][0];
            int end=tasks[i][1];
            int t=st+end;
            if(t<min){
                min=t;
            }
        }
        return min;
        
    }
}