class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        boolean found=false;
        int minsum=Integer.MAX_VALUE;
        for(int size=l;size<=r;size++){
            for(int i=0;i<=n-size;i++){
                int sum = 0;
                for(int j=0;j<size;j++){
                    sum+=nums.get(i+j);
                }
                if(sum>0){
                    found=true;
                    minsum=Math.min(minsum,sum);
                }

            }
        }
        return found?minsum:-1;
        
    }
}

