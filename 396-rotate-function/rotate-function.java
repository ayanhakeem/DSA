class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0;
        int f0=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f0+=i*nums[i];
        }
        int max=f0;

        for(int k=0;k<n;k++){
            int newf=f0+sum-n*nums[n-1-k];
            max=Math.max(max,newf);

            f0=newf;
        }

        return max;

    
        
    }
}


//brute force simulation/rotate tc=o(n^2)
//sc=o(1)
// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int n=nums.length;
//         int k=0;
//         int max=0;
//         if(n==1) return 0;
//         while(k<n){
//             int sum=0;
//             for(int i=0;i<n;i++){
//                 sum += i * nums[(i - k + n) % n];
//             }
//             max=Math.max(max,sum);
//         }
//         return max;
//     }
// }