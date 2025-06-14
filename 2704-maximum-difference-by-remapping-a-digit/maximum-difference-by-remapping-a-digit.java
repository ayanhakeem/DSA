class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);

        
        char replaceForMax = ' ';
        for (char c : str.toCharArray()) {
            if (c != '9') {
                replaceForMax = c;
                break;
            }
        }
        String maxStr = (replaceForMax == ' ') ? str : str.replace(replaceForMax, '9');

        
        char replaceForMin = ' ';
        for (char c : str.toCharArray()) {
            if (c != '0') {
                replaceForMin = c;
                break;
            }
        }
        String minStr = (replaceForMin == ' ') ? str : str.replace(replaceForMin, '0');

      
        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}
