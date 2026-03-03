class Solution {
    private static void dfs(int node, List<List<Integer>> adjList, boolean[] visited){
        visited[node]=true;
        for(int neigh:adjList.get(node)){
            if(!visited[neigh]){
                visited[neigh]=true;
                dfs(neigh,adjList,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjList = new ArrayList<>();
        int v=isConnected.length;
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());//initialize that arraylist
        }
       
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int cnt=0;
        
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                cnt++;
                dfs(i,adjList,visited);
            }
        }
        return cnt;
        
    }
}