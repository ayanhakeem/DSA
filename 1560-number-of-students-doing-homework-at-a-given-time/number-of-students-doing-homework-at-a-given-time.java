class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i=0,j=0;
        int cnt=0;
        while(i<startTime.length && j<endTime.length){
            if(startTime[i]<=queryTime && endTime[j]>=queryTime){
                cnt++;
            }
            i++;
            j++;
        }
        return cnt;
    }
}