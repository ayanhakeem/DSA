class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int sum=0;
        int cnt=0;
        for(int i=n-1;i>0;i--){
            sum+=nums[i];
            if(nums[i-1]>sum/(n-i)) cnt++;
        }
        return cnt;
        
    }
}

// class Solution {
//     public static boolean avgsum(int st,int nums[]){
//         int n=nums.length;
//         int sum=0;
//         for(int i=st+1;i<n;i++){
//             sum+=nums[i];
//         }
//         int totele=n-st-1;
//         float avg=(float)sum/totele;
//         return nums[st]>avg;
//     }
//     public int dominantIndices(int[] nums) {
//         int n=nums.length;
//         int cnt=0;
//         for(int i=n-2;i>=0;i--){
//             if(avgsum(i,nums)){
//                 cnt++;
//             }
//         }
//         return cnt;
        
//     }
// }
//tc=o(n^2)
//sc=o(1)