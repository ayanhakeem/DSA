import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int l = 0; // Pointer for nums1
        int r = 0; // Pointer for nums2
        List<int[]> result = new ArrayList<>(); // Dynamic list to store the result

        // Merge the two arrays
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l][0] < nums2[r][0]) {
                // Add the element from nums1
                result.add(new int[]{nums1[l][0], nums1[l][1]});
                l++;
            } else if (nums1[l][0] > nums2[r][0]) {
                // Add the element from nums2
                result.add(new int[]{nums2[r][0], nums2[r][1]});
                r++;
            } else {
                // IDs are equal, merge the values
                result.add(new int[]{nums1[l][0], nums1[l][1] + nums2[r][1]});
                l++;
                r++;
            }
        }

        // Add remaining elements from nums1
        while (l < nums1.length) {
            result.add(new int[]{nums1[l][0], nums1[l][1]});
            l++;
        }

        // Add remaining elements from nums2
        while (r < nums2.length) {
            result.add(new int[]{nums2[r][0], nums2[r][1]});
            r++;
        }

        // Convert the list to a 2D array
        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}