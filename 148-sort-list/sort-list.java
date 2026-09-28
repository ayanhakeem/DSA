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
    private ListNode mergeLists(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
 
        while (first != null && second != null) {
            if (first.val <= second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }
 
        tail.next = (first != null) ? first : second;
        return dummy.next;
    }
 
    // Function to find middle predecessor and split list.
    private ListNode splitList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
 
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
 
        ListNode second = slow.next;
        slow.next = null;
        return second;
    }
 
    // Function to sort a linked list using merge sort.
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
 
        ListNode second = splitList(head);
        ListNode left = sortList(head);
        ListNode right = sortList(second);
 
        return mergeLists(left, right);
    }
}