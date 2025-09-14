import java.util.*;
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
          
        Integer[] nums2 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(nums2, Collections.reverseOrder());

        Set<Integer> seen = new HashSet<>();
        List<Integer> ansList = new ArrayList<>();

        for (int num : nums2) {
            if (!seen.contains(num)) {
                seen.add(num);
                ansList.add(num);
            }
            if (ansList.size() == k) {
                break;
            }
        }

        
        

      
        int[] ans = ansList.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
     
    
}