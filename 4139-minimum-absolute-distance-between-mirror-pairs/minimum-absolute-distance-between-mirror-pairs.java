class Solution {

    public int reverse(int n){
        int rev = 0;
        while(n != 0){
            int ld=n%10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            // Step 1: If current number matches previously stored reverse
            if(map.containsKey(nums[i])){
                ans = Math.min(ans, i - map.get(nums[i]));//if matches update ans
            }

            // Step 2: Store current index under reverse(nums[i])
            int r = reverse(nums[i]);
            map.put(r, i);//store reversed num in map to check further elements in nums
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}






// class Solution {
//     public int reverse(int n){
//         int rev=0;
//         while(n!=0){
//             int ld=n%10;
//             rev=rev*10+ld;
//             n=n/10;
//         }
//         return rev;
//     }
//     public int minMirrorPairDistance(int[] nums) {
//         int n=nums.length;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(reverse(nums[i])==nums[j]){
//                     int abs=Math.abs(i-j);
//                     min=Math.min(min,abs);
//                 }
//             }
//         }
//         return (min==Integer.MAX_VALUE?-1:min);
        
//     }
// }