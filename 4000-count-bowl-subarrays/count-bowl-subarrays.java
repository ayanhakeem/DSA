import java.util.*;

class Solution {
    public long bowlSubarrays(int[] nums) {
       
        int n = nums.length;
        
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            lmax[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,nums[i]);
            rmax[i]=max;
        }

        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=lmax[i] && nums[i]!=rmax[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
//tc=o(n)
//sc=o(2n)


// import java.util.*;

// class Solution {
//     public long bowlSubarrays(int[] nums) {
//         long res = 0;
//         int n = nums.length;
        
//         int[] nextleft = new int[n];
//         int[] nextright = new int[n];
        
//         Arrays.fill(nextleft, -1);
//         Arrays.fill(nextright, -1);
        
//         Deque<Integer> stack = new ArrayDeque<>();
        
//         // Compute nextright
//         for (int i = n - 1; i >= 0; i--) {
//             while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
//                 stack.pop();
//             }
//             if (!stack.isEmpty()) {
//                 nextright[i] = stack.peek();
//             }
//             stack.push(i);
//         }
        
//         stack.clear();
        
//         // Compute nextleft
//         for (int i = 0; i < n; i++) {
//             while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
//                 stack.pop();
//             }
//             if (!stack.isEmpty()) {
//                 nextleft[i] = stack.peek();
//             }
//             stack.push(i);
//         }
        
//         // Count valid subarrays
//         for (int i = 0; i < n; i++) {
//             if (nextleft[i] != -1 && nextright[i] != -1) {
//                 res++;
//             }
//         }
        
//         return res;
//     }
// }
