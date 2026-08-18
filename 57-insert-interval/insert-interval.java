class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        int n=intervals.length;
        List<int[]>res=new ArrayList<>();
        //add no overlapping intervals
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        //add merged overlap
        while(i<n && newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        //after merged non overlapping add
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);

    }
}

//tc=o(n)
//sc=o(n)