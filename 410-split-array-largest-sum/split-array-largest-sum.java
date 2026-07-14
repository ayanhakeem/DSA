class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int i:nums){
            sum+=i;
            max=Math.max(max,i);
        }

        int l=max,h=sum;
        while(l<h){
            int m=l+(h-l)/2;
            if(canSplit(nums,k,m)){//try even smaller
                h=m;
            }else{
                l=m+1;//if subarray sum is too small r=then move l
            }
        }
        return l;
    }

    public static boolean canSplit(int nums[],int k,int maxsum){
        int sum=0;
        int cnt=1;
        for(int i:nums){
            if(i+sum>maxsum){
                cnt++;
                sum=i;//assign num/i to sum then recheck can split with k splits
            }else{
                sum+=i;
            }
        }
        return cnt<=k;
    }
}