import java.util.*;

public class Solution {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        List<int[]>ans=new ArrayList<>();
        for(int interval[]:intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<interval[0]){
                ans.add(interval);
            }else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
        

    }
}















// import java.util.*;

// public class Solution {

//     public static int[][] merge(int[][] intervals) {
//         // Edge case: If the input array is empty, return an empty array
//         if (intervals.length == 0) {
//             return new int[0][0];  // Corrected the empty array initialization
//         }

//         // Step 1: Sort intervals based on the starting time
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

//         // Step 2: Create a list to hold the merged intervals
//         List<int[]> merged = new ArrayList<>();

//         // Step 3: Iterate over the intervals and merge if necessary
//         for (int[] interval : intervals) {
//             // If merged list is empty or there is no overlap
//             if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
//                 merged.add(interval);
//             } else {
//                 // If there's an overlap, merge by updating the end time
//                 merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
//             }
//         }

//         // Convert the list to a 2D array and return
//         return merged.toArray(new int[merged.size()][]);
//     }
// }


