/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      
        // Priority queue that sorts nodes by their value
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        // Add the head of each list to the priority queue
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node to help build the result list
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        // Process nodes in the priority queue
        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll(); // Get the node with the smallest value
            temp.next = minNode;          // Attach it to the result list
            temp = temp.next;             // Move the tail

            // If there is a next node, add it to the queue
            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }

        return dummy.next; // Return the head of the merged list
    }
}
//tc=O(N*K*log k)
//sc=o(k)
