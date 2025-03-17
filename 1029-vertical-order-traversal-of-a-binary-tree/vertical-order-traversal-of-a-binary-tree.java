import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class Solution {
    static class Tuple {
        TreeNode node;
        int col, row;

        Tuple(TreeNode node, int col, int row) {
            this.node = node;
            this.col = col;
            this.row = row;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // TreeMap<Column, TreeMap<Row, MinHeap (sorted nodes)>>
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();

        // Start BFS with root at (row=0, col=0)
        queue.add(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int col = tuple.col;
            int row = tuple.row;

            // Insert into TreeMap
            map.putIfAbsent(col, new TreeMap<>());//line
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).add(node.val);

            // Process left and right children
            if (node.left != null) queue.add(new Tuple(node.left, col - 1, row + 1));
            if (node.right != null) queue.add(new Tuple(node.right, col + 1, row + 1));
        }

        // Extract results in sorted order
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> colVals = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : rows.values()) {
                while (!nodes.isEmpty()) {
                    colVals.add(nodes.poll());
                }
            }
            result.add(colVals);
        }

        return result;
    }
}
