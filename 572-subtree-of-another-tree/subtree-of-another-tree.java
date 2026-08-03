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
    public static boolean issame(TreeNode s,TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if (t!=null && s!=null && s.val == t.val) {
            return issame(s.left, t.left) &&issame(s.right, t.right);
        }
        return false;

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(subRoot==null) return true;//empty tree also subtree of tree
       if(root==null) return false;//if root tree is empty 
       if(issame(root, subRoot)) {
            return true;
        }

       return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);


    }
}