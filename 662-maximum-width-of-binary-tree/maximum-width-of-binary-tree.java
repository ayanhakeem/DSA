//tc=0(n);
//sc=0(n);
import java.util.*;

class Solution {
    class Pair {
        TreeNode node;
        int idx;

        Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        int ans = 0;
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().idx;  // Reference for index normalization
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair current = q.poll();
                int curridx = current.idx - min;  // Avoid overflow by normalizing
                
                if (i == 0) {
                    first = curridx;
                }
                if (i == size - 1) {
                    last = curridx;
                }
                
                if (current.node.left != null) {
                    q.add(new Pair(current.node.left, curridx * 2 + 1));
                }
                if (current.node.right != null) {
                    q.add(new Pair(current.node.right, curridx * 2 + 2));
                }
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }
}
