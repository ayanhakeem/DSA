class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = sumOfDigits(Math.abs(nums[i]));
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }

    
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // extract last digit
            num /= 10;        // remove last digit
        }
        return sum;
    }
}
