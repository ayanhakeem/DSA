import java.util.ArrayList;

public class Solution {

    // Main function to count reverse pairs
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    // Helper function to perform merge sort and count reverse pairs
    private int mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;
        int count = mergeSort(nums, low, mid) + mergeSort(nums, mid + 1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    // Count reverse pairs between nums[low..mid] and nums[mid+1..high]
    private int countPairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        // Count the pairs
        for (int i = low; i <= mid; i++) {
            while (right <= high && nums[i] > 2L * nums[right]) {
                right++;
            }
            cnt += (right - (mid + 1));//how many num of ele in left
        }
        return cnt;
    }

    // Merge two sorted halves of the array
    private void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // Merging elements in a sorted manner
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // If elements on the left half are still left
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        // If elements on the right half are still left
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // Transfering all elements from temporary array to original array
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}
