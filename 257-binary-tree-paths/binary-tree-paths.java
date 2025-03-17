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
    public static void solve(TreeNode root, List<String> currpath, List<String> ans) {
        if (root == null) return;

        currpath.add(String.valueOf(root.val)); // Convert int to String

        if (root.left == null && root.right == null) {
            ans.add(String.join("->", currpath)); // Convert path list to a string
        } else {
            solve(root.left, currpath, ans);
            solve(root.right, currpath, ans);
        }

        currpath.remove(currpath.size() - 1); // Backtracking step
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        if(root==null) return ans;//empty list
        solve(root,new ArrayList<>(),ans);
        return ans;
        
    }
}