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
    public ListNode removeNthFromEnd(ListNode head,int n) {
       ListNode fp=head;
       ListNode sp=head;
       for(int i=0;i<n;i++){
        fp=fp.next;
       }
       if (fp == null)
            return head.next;

       while(fp.next!=null){
        sp=sp.next;
        fp=fp.next;
       }
       ListNode delNode=sp.next;
       sp.next=sp.next.next;
       delNode=null;
       return head;
    }
}

//tc=o(n)
//sc=o(1)