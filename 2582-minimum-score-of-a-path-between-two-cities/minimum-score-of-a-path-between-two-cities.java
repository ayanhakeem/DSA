class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>>graph=new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int road[]:roads){
            int u = road[0];
            int v = road[1];
            int d = road[2];

            graph.get(u).add(new int[]{v, d});
            graph.get(v).add(new int[]{u, d});//undirected
        }

        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[n+1];
        q.offer(1);
        vis[1]=true;

        int min=Integer.MAX_VALUE;

        while(!q.isEmpty()){
            int curr=q.poll();
            for(int edge[]:graph.get(curr)){
                int next=edge[0];
                int dist=edge[1];

                min=Math.min(min,dist);

                if(!vis[next]){
                    vis[next]=true;
                    q.offer(next);
                }
            }
        }
        return min;
    }
}