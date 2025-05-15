import java.util.*;

class Solution {
    private boolean dfs(int node, int col, int[] color, ArrayList<ArrayList<Integer>> adj) {
        color[node] = col;
        for (int it : adj.get(node)) {
            if (color[it] == -1) {
                if (dfs(it, 1 - col, color, adj)==false) return false;
            } else if (color[it] == col) {
                return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());

        // Convert input edge list to adjacency list
        for (int i = 0; i < v; i++) {
            for (int j : graph[i]) {
                adj.get(i).add(j);
                // Note: no need to add adj.get(j).add(i) since the graph is already undirected
            }
        }

        int[] color = new int[v];
        Arrays.fill(color, -1);

        for (int i = 0; i < v; i++) {
            if (color[i] == -1) {
                if(dfs(i, 0, color, adj)==false) return false;
            }
        }

        return true;
    }
}
