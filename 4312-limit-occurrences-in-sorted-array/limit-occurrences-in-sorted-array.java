class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        list.add(nums[0]);
        int cnt=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                cnt++;
            }else{
                cnt=1;
            }
          
            if(cnt<=k){
                list.add(nums[i]);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;

    }

}

