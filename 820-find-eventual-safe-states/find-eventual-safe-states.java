class Solution {
    private boolean dfsCheck(int node, int[][] graph, int[] vis, int[] pathVis, int[] check) {

        vis[node] = 1;
        pathVis[node] = 1;
        check[node] = 0; // assume unsafe initially

        for (int neighbor : graph[node]) {

            if (vis[neighbor] == 0) {
                if (dfsCheck(neighbor, graph, vis, pathVis, check)) return true;//cycle exist means no safe node
            } 
            else if (pathVis[neighbor] == 1) {
                return true; // cycle found means no safe node
            }
        }

        check[node] = 1; // no cycle exists safe node
        pathVis[node] = 0;

        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int V = graph.length;

        int[] vis = new int[V];
        int[] pathVis = new int[V];
        int[] check = new int[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfsCheck(i, graph, vis, pathVis, check);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (check[i] == 1) safeNodes.add(i);
        }

        return safeNodes;
    }
}

//tc=o(v+e)
//sc=o(v)