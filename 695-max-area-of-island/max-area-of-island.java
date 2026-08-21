class Solution {
    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public int bfs(int[][] grid, int ro, int co) {
        Queue<Pair> q = new LinkedList<>();
        int res=1;//include curr cell 1
        q.add(new Pair(ro, co));
        grid[ro][co] = 0;//mark visited
        int n = grid.length;
        int m = grid[0].length;

        // Only 4 directions: up, right, down, left
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = row + dRow[i];
                int ncol = col + dCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol));
                    res++;//on 
                    grid[nrow][ncol] = 0;
                }
            }
        }
        return res;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == 1) {
                    cnt=Math.max(cnt,bfs(grid,row,col));
                }
            }
        }
        return cnt;
    }
}