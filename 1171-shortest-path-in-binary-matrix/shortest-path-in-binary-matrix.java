class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // If start or end is blocked, no path exists
        if (grid[0][0] == 1 || grid[n-1][m-1] == 1) return -1;

        // Edge case: 1x1 grid
        if (n == 1 && m == 1) return 1;

        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][0] = 1;//mark src as 0

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0, 0}); // {pathLength, row, col}

        // All 8 directions (including diagonals)
        int[] dr = {-1, -1, -1,  0, 0,  1, 1, 1};
        int[] dc = {-1,  0,  1, -1, 1, -1, 0, 1};

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int dis = current[0], r = current[1], c = current[2];

            for (int i = 0; i < 8; i++) {
                int newr = r + dr[i];
                int newc = c + dc[i];

                if (newr >= 0 && newr < n && newc >= 0 && newc < m
                        && grid[newr][newc] == 0          // open cell
                        && dis + 1 < dist[newr][newc]) {

                    dist[newr][newc] = dis + 1;

                    if (newr == n - 1 && newc == m - 1)
                        return dis + 1; // reached bottom-right

                    q.offer(new int[]{dis + 1, newr, newc});
                }
            }
        }

        return -1;
    }
}