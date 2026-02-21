class Solution {
    static class row implements Comparable<row>{
        int soldiers;
        int idx;

        public row(int soldiers,int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }

        @Override
        public int compareTo(row r2){
            if(this.soldiers==r2.soldiers){
                return this.idx-r2.idx;
            }
            else{
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<row>pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                cnt+=mat[i][j]==1?1:0;
            }
            pq.add(new row(cnt,i));
        }
        int ans[]=new int[k];
        int j=0;
        for(int i=0;i<k;i++){
            ans[j++]=pq.remove().idx;
        }
        return ans;
        
        
    }
}


// PriorityQueue<int[]> pq = new PriorityQueue<>(
//             (a, b) -> {
//                 if (a[0] == b[0]) return a[1] - b[1];  // compare index
//                 return a[0] - b[0];                   // compare soldiers
//             }
//         );


