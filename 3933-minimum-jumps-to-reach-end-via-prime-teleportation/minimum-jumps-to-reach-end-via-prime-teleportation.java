class Solution {
    class Pair {
        int idx;
        int jumps;

        Pair(int idx, int jumps) {
            this.idx = idx;
            this.jumps = jumps;
        }
    }

    public static boolean isprime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public int minJumps(int[] nums) {
        int n = nums.length;
        //precompute prime factors
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            int x = nums[i];

            for (int f = 2; f * f <= x; f++) {

                if (x % f == 0) {

                    map.putIfAbsent(f, new ArrayList<>());
                    map.get(f).add(i);

                    while (x % f == 0) {
                        x /= f;
                    }
                }
            }
            // remaining prime factor
            if (x > 1) {
                map.putIfAbsent(x, new ArrayList<>());
                map.get(x).add(i);
            }
        }

        //bfs
        Queue<Pair> q = new LinkedList<>();
        boolean vis[] = new boolean[n];
        HashSet<Integer> usedPrime = new HashSet<>();
        q.add(new Pair(0, 0));//idx,jumps
        vis[0] = true;
        while (!q.isEmpty()) {
            Pair currpoped = q.poll();
            int cur = currpoped.idx;
            int steps = currpoped.jumps;

            if (cur == n - 1)
                return steps;

            //left 
            if (cur - 1 >= 0 && !vis[cur - 1]) {
                vis[cur - 1] = true;
                q.add(new Pair(cur - 1, steps + 1));
            }

            //right
            if (cur + 1 < n && !vis[cur + 1]) {
                vis[cur + 1] = true;
                q.add(new Pair(cur + 1, steps + 1));
            }
            // teleportation
            if (isprime(nums[cur]) && !usedPrime.contains(nums[cur])) {

                int p = nums[cur];

                for (int next : map.get(p)) {

                    if (!vis[next]) {

                        vis[next] = true;

                        q.add(new Pair(next, steps + 1));
                    }
                }

                usedPrime.add(p);
            }
        }

        return -1;
    }
}