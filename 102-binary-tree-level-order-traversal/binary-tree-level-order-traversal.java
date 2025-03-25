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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer>subans=new ArrayList<>();
            for(int i=0;i<level;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                subans.add(q.poll().val);
            }
            ans.add(subans);
        }
        return ans;
    }
}