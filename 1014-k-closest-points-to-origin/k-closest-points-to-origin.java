class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>maxheap=new PriorityQueue<>((a,b) -> (b[0]*b[0]-a[0]*a[0])+(b[1]*b[1]-a[1]*a[1]));
        for(int p[]:points){
            maxheap.add(p);
            if(maxheap.size()>k){
                maxheap.remove();
            }
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=maxheap.remove();
        }

        return ans;
        
    }
}

//maxheap solution
// class Solution {
//     static class point implements Comparable<point>{
//         int x;
//         int y;
//         int distsq;

//         public point(int x,int y,int distsq){
//             this.x=x;
//             this.y=y;
//             this.distsq=distsq;
//         }
//         @Override
//         public int compareTo(point p2){
//             return p2.distsq-this.distsq;
//         }
//     }
//     public int[][] kClosest(int[][] points, int k) {
//         int n=points.length;
//         PriorityQueue<point>pq=new PriorityQueue<>();
//         for(int i=0;i<n;i++){
//             int distsq=points[i][0]*points[i][0]+points[i][1]*points[i][1];
//              pq.add(new point(points[i][0],points[i][1],distsq));

//             if(pq.size()>k){
//                 pq.remove();
//             }
//         }
//         int arr[][]=new int[k][2];
//         for(int i=0;i<k;i++){
//             point p=pq.remove();
//             arr[i][0]=p.x;
//             arr[i][1]=p.y;
//         }
//         return arr;
//     }
// }