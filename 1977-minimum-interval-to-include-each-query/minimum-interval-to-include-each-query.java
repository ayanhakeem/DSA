class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));//sort based on st
        PriorityQueue<int[]>minheap=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));//min heap based on st we want min
        Map<Integer,Integer>res=new HashMap<>();
        int i=0;
        for(int q:Arrays.stream(queries).sorted().toArray()){
            while(i<intervals.length && intervals[i][0]<=q){//if st<=q
                int l=intervals[i][0];
                int r=intervals[i][1];
                minheap.offer(new int[]{r-l+1,r});//store size,end
                i++;
            }

            while(!minheap.isEmpty() && minheap.peek()[1]<q){//if any interval's end<q means it is waste no use to consider in heap so poll it
                minheap.poll();
            }
            res.put(q,minheap.isEmpty()?-1:minheap.peek()[0]);

        }
        int result[]=new int[queries.length];
        for(int j=0;j<queries.length;j++){
            result[j]=res.get(queries[j]);
        }
        return result;

    }
}