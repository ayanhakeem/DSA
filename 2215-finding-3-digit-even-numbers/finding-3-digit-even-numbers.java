class Solution {
    private boolean isdigit(int n, int[] digits) {
        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        while (n != 0) {
            int ld = n % 10;
            if (freq[ld] == 0) {
                return false;
            }
            freq[ld]--;
            n /= 10;
        }

        return true;
    }

    public int[] findEvenNumbers(int[] digits) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 100; i <= 999; i += 2) { // only even numbers
            if (isdigit(i, digits)) {
                ans.add(i);
            }
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }
}