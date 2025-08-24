/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    // Step 1: Insert copied nodes in between original nodes
    void insertCopyInBetween(Node head) {
        Node temp = head;
        while (temp != null) {
            Node nextElement = temp.next;

            // create copy with correct field name "val" (not "data")
            Node copy = new Node(temp.val);

            copy.next = nextElement;
            temp.next = copy;

            temp = nextElement;
        }
    }

    // Step 2: Connect random pointers for copied nodes
    void connectRandomPointers(Node head) {
        Node temp = head;
        while (temp != null) {
            Node copyNode = temp.next;
            if (temp.random != null) {
                copyNode.random = temp.random.next; // next of original random is the copy
            } else {
                copyNode.random = null;
            }
            temp = temp.next.next; // move to next original node
        }
    }

    // Step 3: Separate original and copied list
    Node getDeepCopyList(Node head) {
        Node temp = head;
        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while (temp != null) {
            res.next = temp.next;   // add copied node
            res = res.next;

            temp.next = temp.next.next; // restore original list
            temp = temp.next;
        }

        return dummyNode.next;
    }

    // Main function
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopyList(head);
    }
}
//tc=o(3n)
//sc=o(n)
