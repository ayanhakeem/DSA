/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] counter = {0};
        int[] result = {0};
        inOrder(root, counter, k, result);
        return result[0];    
    }
//tc=o(h)
//sc=o(n)
    private void inOrder(TreeNode node, int[] counter, int k, int[] result) {
        if (node == null || counter[0] >= k) return;

        inOrder(node.left, counter, k, result);

        counter[0]++;
        if (counter[0] == k) {
            result[0] = node.val;
            return;
        }

        inOrder(node.right, counter, k, result);
    }
}
