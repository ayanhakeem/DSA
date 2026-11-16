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
    private static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy=new ListNode();
        ListNode temp=dummy;
        Stack<ListNode>s1=new Stack<>();
        Stack<ListNode>s2=new Stack<>();
        while(l1!=null){
            s1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2);
            l2=l2.next;
        }
        int carry=0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry==1){//carry!=0
            int sum=0;
            if(!s1.isEmpty()){
                sum+=s1.pop().val;
            }
            if(!s2.isEmpty()){
                sum+=s2.pop().val;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;

        }
        return reverse(dummy.next);
    }
}