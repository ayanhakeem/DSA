class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);

        // STEP 1: Find digit to replace for max — first non-'9' digit
        char replaceForMax = ' ';
        for (char c : str.toCharArray()) {
            if (c != '9') {
                replaceForMax = c;
                break;
            }
        }
        String maxStr = (replaceForMax == ' ') ? str : str.replace(replaceForMax, '9');

        // STEP 2: Find digit to replace for min — first non-'0' digit
        char replaceForMin = ' ';
        for (char c : str.toCharArray()) {
            if (c != '0') {
                replaceForMin = c;
                break;
            }
        }
        String minStr = (replaceForMin == ' ') ? str : str.replace(replaceForMin, '0');

        // Parse strings to integers and return the difference
        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}
