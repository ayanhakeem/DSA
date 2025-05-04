import java.util.*;

// Define a node structure for a trie,
// which contains links to child nodes.
class Node {
    Node[] links;

    Node() {
        links = new Node[2];//0 and 1
    }

    boolean containsKey(int ind) {
        return links[ind] != null;
    }

    Node get(int ind) {
        return links[ind];
    }

    void put(int ind, Node node) {
        links[ind] = node;
    }
}

class Trie {
    Node root;

    Trie() {
        root = new Node();
    }

    void insert(int num) {
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containsKey(bit)) {
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }

    int findMax(int num) {
        Node node = root;
        int maxNum = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.containsKey(1 - bit)) {
                maxNum |= (1 << i);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}

class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        ArrayList<int[]> offlineQueries = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            // Store as [mi, xi, index]
            offlineQueries.add(new int[]{queries[i][1], queries[i][0], i});
        }

        // Sort queries by mi
        offlineQueries.sort(Comparator.comparingInt(a -> a[0]));

        Trie trie = new Trie();
        int index = 0;
        int n = nums.length;

        for (int[] q : offlineQueries) {
            int mi = q[0], xi = q[1], qIndex = q[2];

            while (index < n && nums[index] <= mi) {
                trie.insert(nums[index]);
                index++;
            }

            if (index == 0) {//if no ans found or all ele of nums karger ths mi return -1
                ans[qIndex] = -1;
            } else {
                ans[qIndex] = trie.findMax(xi);
            }
        }

        return ans;
    }
}
