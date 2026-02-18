class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxsum=sum;
        int j=0;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[j];
            maxsum=Math.max(maxsum,sum);
            j++;
        }

        return maxsum/k;
        
    }
}










//tc=o(n2)
//sc=o(1)

// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double max=Integer.MIN_VALUE;
//         int n=nums.length;
//         for(int i=0;i<=n-k;i++){
//             double sum=0;
//             for(int j=i;j<i+k;j++){ 
//                 sum+=nums[j];
//             }
//             double avg=sum/k;
//             if(avg>max){
//                 max=Math.max(max,avg);
//             }
//         }
//         return max;
        
//     }
// }