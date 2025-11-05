class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){//dublicate meand repeted skip 
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int t=nums[i]+nums[j]+nums[k];

                if(t<0){
                    j++;
                }else if(t>0){
                    k--;
                }else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(nums[j]==nums[j-1] && j<k){
                        j++;//skip dulbicate
                    }
                    while(nums[k]==nums[k+1] && j<k){
                        k--;//skip dulbicate
                    }
                }
            } 
        }
        return res;
    }
}