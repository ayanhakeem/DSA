/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //tc=o(n)
 //sc=o(n)
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
         // Check if the tree is empty
        if (root == null) {
            return "";//empty string
        }

        // Initialize an empty string
        // to store the serialized data
        StringBuilder sb = new StringBuilder();
        // Use a queue for
        // level-order traversal
        Queue<TreeNode> q = new LinkedList<>();
        // Start with the root node
        q.add(root);

        // Perform level-order traversal
        while (!q.isEmpty()) {
            // Get the front node in the queue
            TreeNode curNode = q.poll();

            // Check if the current node is
            // null and append "#" to the string
            if (curNode == null) {
                sb.append("n ");
                continue;
            }
                // Append the value of the
                // current node to the string
                sb.append(curNode.val).append(" ");
                // Push the left and right children
                // to the queue for further traversal
                q.add(curNode.left);
                q.add(curNode.right);
            }
             return sb.toString();
        }

        // Return the
        // serialized string
       
        

    
    public TreeNode deserialize(String data) {
        if(data=="") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String values[]=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for(int i=1;i<values.length;i++){
            TreeNode parent=q.poll();
            if(!values[i].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                q.add(left);
            }
            if(!values[++i].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
        
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));