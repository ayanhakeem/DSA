import java.util.*;

class Solution {
    class DSU {
        Map<Integer, Integer> parent = new HashMap<>();

        // Find with path compression
        public int find(int x) {
            parent.putIfAbsent(x, x);
            if (x != parent.get(x))
                parent.put(x, find(parent.get(x)));
            return parent.get(x);
        }

        // Union: connect two nodes
        public void union(int x, int y) {
            parent.put(find(x), find(y));
        }
    }

    public int removeStones(int[][] stones) {
        DSU dsu = new DSU();  

        // Connect each stone's row and column
        // Offset column index by 10001 to avoid collision with row indices
        for (int[] stone : stones) {
            dsu.union(stone[0], stone[1] + 10001);
        }

        Set<Integer> components = new HashSet<>();

        // Each unique component root = one remaining stone
        for (int[] stone : stones) {
            components.add(dsu.find(stone[0]));
        }

        // Stones removed = total stones - number of islands
        return stones.length - components.size();
    }
}