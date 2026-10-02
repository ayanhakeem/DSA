class Solution {
    public int countPrimes(int n) {

        boolean[] isPrime = new boolean[n];

        // Initially assume all numbers are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                // Mark multiples of i as not prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}