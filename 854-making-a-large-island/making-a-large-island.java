import java.util.*;
//dsu used bcoz its related to connecting components
class DisjointSet {
    int[] rank, parent, size;

    public DisjointSet(int n) {
        rank   = new int[n + 1];
        parent = new int[n + 1];
        size   = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            size[i]   = 1;
        }
    }

    public int findUPar(int node) {
        if (node == parent[node]) return node;
        return parent[node] = findUPar(parent[node]);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank[ulp_u] < rank[ulp_v])      parent[ulp_u] = ulp_v;
        else if (rank[ulp_v] < rank[ulp_u]) parent[ulp_v] = ulp_u;
        else { parent[ulp_v] = ulp_u; rank[ulp_u]++; }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v]  += size[ulp_u];
        } else {
            parent[ulp_v] = ulp_u;
            size[ulp_u]  += size[ulp_v];
        }
    }
}

class Solution {
    //  Fields correctly inside Solution class
    private int[] delRow = {-1, 0, 1, 0};
    private int[] delCol = { 0, 1, 0, -1};

    private boolean isValid(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
    //step 1  find all 1's and connect them like  components 
    private void addInitialIslands(int[][] grid, DisjointSet ds, int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) continue;

                for (int ind = 0; ind < 4; ind++) {
                    int newRow = row + delRow[ind];
                    int newCol = col + delCol[ind];

                    if (isValid(newRow, newCol, n) && grid[newRow][newCol] == 1) {
                        int nodeNo    = row    * n + col;
                        int adjNodeNo = newRow * n + newCol;
                        ds.unionBySize(nodeNo, adjNodeNo);
                    }
                }
            }
        }
    }

    public int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n * n);

        addInitialIslands(grid, ds, n);//step 1 initilized

        int ans = 0;
        //step 2 go throgh all 0's and find convert update max
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) continue;

                Set<Integer> components = new HashSet<>();//add unique components

                for (int ind = 0; ind < 4; ind++) {
                    int newRow = row + delRow[ind];
                    int newCol = col + delCol[ind];

                    if (isValid(newRow, newCol, n) && grid[newRow][newCol] == 1) {
                        components.add(ds.findUPar(newRow * n + newCol));//nr*n+col find cell
                    }
                }

                int sizeTotal = 0;
                for (int it : components) sizeTotal += ds.size[it];//add sizes

                ans = Math.max(ans, sizeTotal + 1);//size+1 means self also added
            }
        }

        // Edge case: all cells are already land
        for (int cellNo = 0; cellNo < n * n; cellNo++) {
            ans = Math.max(ans, ds.size[ds.findUPar(cellNo)]);//find ultimate par and update max
        }

        return ans;
    }   
}      

//tc= O(N2) 
//sc=o(n2)