class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        
        ans[0]=1;
        for(int i=1;i<n;i++){//prefix multiplcation means left products
           ans[i]=ans[i-1]*nums[i-1]; 
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){//multiply prefix and suffix meanas left and right product
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        
        
        return ans;
    }
}

//tc=o(n)
//sc=o(n)