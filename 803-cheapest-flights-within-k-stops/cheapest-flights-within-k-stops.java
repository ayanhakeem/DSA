import java.util.*;

class Edge {
    int dest, wt;
    Edge(int dest, int wt) {
        this.dest = dest;
        this.wt = wt;
    }
}

class Info {
    int v, cost, stops;
    Info(int v, int cost, int stops) {
        this.v = v;
        this.cost = cost;
        this.stops = stops;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Step 1: Build the adjacency list
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] flight : flights) {
            graph.get(flight[0]).add(new Edge(flight[1], flight[2]));
        }

        // Step 2: Distance array
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Step 3: Priority Queue for BFS (min-heap based on cost)
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();
            int u = curr.v, costSoFar = curr.cost, stops = curr.stops;

            if (stops > k) break;

            for (Edge e : graph.get(u)) {
                int v = e.dest, wt = e.wt;
                if (costSoFar + wt < dist[v]) {
                    dist[v] = costSoFar + wt;
                    q.add(new Info(v, dist[v], stops + 1));
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
