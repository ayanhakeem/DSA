class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt=0;
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int currintervalend=intervals[0][1];
        for(int i=1;i<n;i++){
            if(currintervalend<=intervals[i][0]){
                currintervalend=intervals[i][1];
            }else{
                cnt++;
            }
            
            
           

        }
        return cnt;
        
    }
}