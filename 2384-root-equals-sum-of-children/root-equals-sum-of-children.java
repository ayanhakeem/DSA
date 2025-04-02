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
    public boolean checkTree(TreeNode root) {
        // Base case: if node is null or it's a leaf node, return true
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        // If only one child is missing, the property fails (unless it's a leaf)
        if (root.left == null || root.right == null) {
            return false;
        }

        // Check if current node's value equals the sum of its children's values
        if (root.val == root.left.val + root.right.val) {
            // Recursively check left and right subtrees
            return checkTree(root.left) && checkTree(root.right);
        } else {
            return false;
        }
    }
}