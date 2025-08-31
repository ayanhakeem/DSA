class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n1 = order.length, n2 = friends.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            int rotations = 0;
            boolean found = false;
            int j = 0;

            while (rotations < 2 && !found) {
                if (order[i] == friends[j]) {
                    arr.add(order[i]);
                    found = true;
                } else {
                    j++;
                    if (j == n2) { // one rotation completed
                        j = 0;
                        rotations++;
                    }
                }
            }
            // if not found, just skip (i++ handled by loop)
        }

        // convert to int[]
        int[] ans = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            ans[k] = arr.get(k);
        }
        return ans;
    }
}
