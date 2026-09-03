class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n];

        Arrays.sort(nums);

        int mid=(n+1)/2;//divide into 2 halves /split
        int high=n;

        for(int i=0;i<n;i+=2){
            temp[i]=nums[--mid];//place smaller half in even idx
        }

        for(int i=1;i<n;i+=2){
            temp[i]=nums[--high];//place larger half in odd places
        }

        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}