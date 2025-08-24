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

    // Reverse linked list and return new head
    static ListNode reverseLinkedList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev; // new head
    }

    // Get the k-th node starting from temp
    static ListNode getKthNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    // Main function to reverse nodes in k-groups
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null) {
            ListNode kThNode = getKthNode(temp, k);

            // Not enough nodes left
            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null; // cut group

            // Reverse current group
            reverseLinkedList(temp);

            if (temp == head) {
                head = kThNode; // update head
            } else {
                prevLast.next = kThNode;
            }

            prevLast = temp; // last node of this group
            temp = nextNode; // move to next group
        }

        return head;
    }
}
//tc=o(2n)
//sc=o(1)