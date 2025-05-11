//tc=o(m+n)
//sc=o(1)

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for the last elements in nums1 and nums2, and the last index in nums1
        int i = m - 1;  // Pointer for the last element in the valid part of nums1
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1 (total length)

        // Merge nums1 and nums2 in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Place the larger element in nums1
            } else {
                nums1[k--] = nums2[j--]; // Place the larger element in nums1
            }
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // If there are any remaining elements in nums1, they are already in place
         while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
    }
}
