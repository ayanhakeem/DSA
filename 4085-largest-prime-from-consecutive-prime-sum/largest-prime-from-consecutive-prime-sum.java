class Solution {

    public boolean isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int largestPrime(int n) {
        int sum = 0;
        int ans = 0;

        for (int num = 2; num <= n; num++) {
            if (isprime(num)) {
                sum += num;

                if (sum > n) break;

                // IMPORTANT CHECK
                if (isprime(sum)) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
