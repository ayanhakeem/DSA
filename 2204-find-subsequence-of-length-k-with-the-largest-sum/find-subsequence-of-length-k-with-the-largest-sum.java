import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // Min heap based on value
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        // Step 1: Keep k largest elements
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            
            if (pq.size() > k) {
                pq.poll();  // remove smallest
            }
        }

        // Step 2: Extract elements
        List<int[]> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        // Step 3: Sort by original index
        Collections.sort(list, (a, b) -> a[1] - b[1]);

        // Step 4: Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }

        return result;
    }
}