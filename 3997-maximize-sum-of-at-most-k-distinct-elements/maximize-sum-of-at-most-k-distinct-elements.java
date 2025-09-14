import java.util.*;
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
          
             // Use a Set to store distinct elements
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Use a max heap (priority queue with reverse order)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(set);

        // Extract up to k elements
        List<Integer> ansList = new ArrayList<>();
        
        while (ansList.size() < k && !maxHeap.isEmpty()) {
            ansList.add(maxHeap.poll());
        }

        // Convert list to array
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
     
    
}