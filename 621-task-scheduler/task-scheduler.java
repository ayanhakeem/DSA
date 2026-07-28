class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq) {
            if (f > 0) {
                pq.offer(f);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            for (int i = 1; i <= n + 1; i++) {
                if (!pq.isEmpty()) {
                    temp.add(pq.poll() - 1);
                }
            }

            for (int f : temp) {
                if (f > 0) {
                    pq.offer(f);
                }
            }

            if (pq.isEmpty()) {
                time += temp.size();
            } else {
                time += n + 1;
            }
        }

        return time;
    }
}

//watch mik 
//tc=o(n)
//sc=o(26)