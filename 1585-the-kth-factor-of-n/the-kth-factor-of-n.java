import java.util.ArrayList;

class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> factors = new ArrayList<>();

        // Find factors up to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) { // Avoid duplicate factors for perfect squares
                    factors.add(n / i);
                }
            }
        }

        // Sort factors in ascending order
        factors.sort(null);

        return k <= factors.size() ? factors.get(k - 1) : -1;
    }
}
