class Solution {
    class Pair{
        int idx;
        int val;

        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
    }
    public boolean canReach(int[] arr, int start) {
        //bfs logic 
        int n=arr.length;
        Queue<Pair>q=new LinkedList<>();
        boolean vis[]=new boolean[n];
        q.add(new Pair(start,arr[start]));
        vis[start]=true;
        
        while(!q.isEmpty()){
            Pair ele=q.remove();
            int index=ele.idx;
            int value=ele.val;
            if(value==0) return true;
            int forward=index+arr[index];
            int backward=index-arr[index];
            if(forward>=0 && forward<n && !vis[forward]){
                q.add(new Pair(forward,arr[forward]));
                vis[forward]=true;
            }

            if( backward>=0 && backward<n && !vis[backward]){
                q.add(new Pair(backward,arr[backward]));
                vis[backward]=true;
            }

        }
        return false;
    }
}