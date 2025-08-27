class Solution {//sliding window
    public int slidingcount(int nums[],int d){
        int i=0,j=1,n=nums.length,count=0;
        while(j<n){
            if(nums[j]-nums[i]>d){
                i++;
            }else{
                count+=j-i;//pairs left side all <=d
                j++;
            }
        }
        return count;
    }
    public int smallestDistancePair(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0,r=nums[n-1]-nums[0];
        int res=0;
        while(l<=r){//binary search
            int mid=l+(r-l)/2;
            int countpair=slidingcount(nums,mid);
            if(countpair<k){
                l=mid+1;
            }else{
                res=mid;//store res as possible pair kth smallest
                r=mid-1;

            }
        }
        return res;
    }
}
//tc=o(nlogn)+o(n log m)
//sc=o(1)

//using dist count how many pairs have of distance
/*class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;  
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int dist[]=new int[max+1];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dif=Math.abs(nums[i]-nums[j]);
                dist[dif]++;
            }
        }
        for(int i=0;i<max+1;i++){
            k-=dist[i];
            if(k<=0){
                return i;
            }
        }
        return -1;
        
    }
}*/