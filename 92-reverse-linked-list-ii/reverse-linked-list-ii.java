
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) return head;

        ListNode templ = head;
        ListNode beforeLeft = null;

        // Reach the node before left
        for (int i = 1; i < left; i++) {
            beforeLeft = templ;
            templ = templ.next;
        }

        ListNode tempr = head;

        // Reach the node at right
        for (int i = 1; i < right; i++) {
            tempr = tempr.next;
        }

        // Save node after right
        ListNode afterRight = tempr.next;

        // Reverse the sublist
        ListNode curr = templ;
        ListNode next;
        ListNode prev = null;

        while (curr != afterRight) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Reconnect the reversed sublist
        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }

        templ.next = afterRight;

        return head;
    }
}
