class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        while (i < n || j < m) {
            // convert to integer (if index out of range, use 0)
            int num1 = i < n ? Integer.parseInt(arr1[i]) : 0;
            int num2 = j < m ? Integer.parseInt(arr2[j]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;

            i++;
            j++;
        }

        return 0; // all revisions are equal
    }
}
