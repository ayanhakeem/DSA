class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }else{
                if(nums[i]>max2){
                    max2=nums[i];
                }
            }
            
        }
        return (max1-1)*(max2-1);
    }
}

// class Solution {
//     public int maxProduct(int[] nums) {
//        Arrays.sort(nums);
//        int n=nums.length;
//        int fe=nums[n-1]-1;
//        int se=nums[n-2]-1;
//        int p=fe*se;
//        return p; 
//     }
// }
//tc=o(nlogn)
//sc=o(1)