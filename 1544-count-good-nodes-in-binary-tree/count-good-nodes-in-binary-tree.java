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

    public int dfs(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        int cnt = 0;

        if (root.val >= max) {
            cnt++;
        }

        max = Math.max(max, root.val);

        cnt += dfs(root.left, max);
        cnt += dfs(root.right, max);

        return cnt;
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
}