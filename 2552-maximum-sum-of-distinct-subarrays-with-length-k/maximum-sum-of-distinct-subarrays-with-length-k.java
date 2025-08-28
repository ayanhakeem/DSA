import java.util.*;
//optimized tc=o(n) and sc=o(1) using set
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long windowSum = 0, maxSum = 0;
        int n = nums.length;

        int left = 0;
        for (int right = 0; right < n; right++) {
            // if duplicate found, shrink window from left
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // add current element
            set.add(nums[right]);
            windowSum += nums[right];

            // maintain window size = k
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // check valid window
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}



/*2nd approach with sc=o(k)
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        long ws=0,ms=0;
        int n=nums.length;
        int l=0;
        for(int r=0;r<n;r++){//maintain window size k
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            ws+=nums[r];

            if(r-l+1>k){//if the window size>k
                int remove=nums[l++];//remove from left and l++
                map.put(remove,map.get(remove)-1);
                if(map.get(remove)==0) map.remove(remove);//if its freq is 0 remove from map
                ws-=remove;//remove from window sum
            }
            if(map.size()==k && r-l+1==k){//if map.size==k and window.size==k the update maxsum
                ms=Math.max(ms,ws);
            }

        }
        return ms;
        
    }
}
//tc=o(n) for inset into map 
//sc=o(k) mapp stores atmost k elements */