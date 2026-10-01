class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
    
    }
}

// class Solution {
//     public void moveZeroes(int[] nums) {
//        int c=0;
//        int n=nums.length;
//        for(int i=0;i<n;i++){
//         if(nums[i]!=0){
//             nums[c]=nums[i];
//             c++;
//         }
//        }
//        while(c<n){
//         nums[c]=0;
//         c++;
//        }
        
//     }
// }
//tc=o(n)
//sc=o(1)