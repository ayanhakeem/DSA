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
 //tc=o(h)
 //sc=o(h)*2
 public class bstiterator{
    Stack<TreeNode>st=new Stack<>();
    boolean reverse=true;

    public bstiterator(TreeNode root,boolean isreverse){
        reverse=isreverse;
        pushAll(root);
    }
    public boolean hasnext(){
        return !st.isEmpty();
    }
    public int next(){
        TreeNode temp=st.pop();
        if(reverse==false) pushAll(temp.right);
        else pushAll(temp.left);
        return temp.val;

    }
    private void pushAll(TreeNode node){
        while(node!=null){
            st.push(node);
            if(reverse==true){
                node=node.right;
            }else{
                node=node.left;
            }
        }
    }
 }
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        bstiterator l=new bstiterator(root,false);
        bstiterator r=new bstiterator(root,true);
        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k) return true;
            else if(i+j<k) i=l.next();
            else j=r.next();
        }
        return false;
        
    }
}