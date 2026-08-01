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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;//fast is n far from slow
        }
        while(fast!=null){
            slow=slow.next;//slow will at l-n th node
            fast=fast.next;
        }
        slow.next=slow.next.next;//skip l-n+1 node/ delete node
        return dummy.next;
    }
}