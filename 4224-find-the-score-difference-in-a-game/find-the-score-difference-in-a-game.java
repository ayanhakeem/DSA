class Solution {
    public int scoreDifference(int[] nums) {
        int f=0,s=0;
        boolean isfirst=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1) isfirst=!isfirst;
            if(i%6==5) isfirst=!isfirst;

            if(isfirst) f+=nums[i];
            else s+=nums[i];

            
        }
        return f-s;
        
    }
}

//tc=o(n)
//sc=o(1)

