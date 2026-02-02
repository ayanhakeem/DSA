class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                min=Math.min(min,nums[i]);//o(n)
            }
        }

        for(int i=n-2;i>=0;i--){//o(n)
            if(nums[i]>nums[i+1]){
                max=Math.max(max,nums[i]);
            }
        }
        if(min==Integer.MAX_VALUE && max==Integer.MIN_VALUE) return 0;

       int st=0,end=n-1;
        for(;st<n;st++){
            if(nums[st]>min)  break;//if duplicates is there find start and end //o(n)   
        }
        for(;end>=0;end--){//o(n)
            if(nums[end]<max) break;
        }

        return end-st+1;
        
    }
}

//tc=o(n)
//sc=o(1)