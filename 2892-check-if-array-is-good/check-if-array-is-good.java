class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        
        int cnt=0;
        for(int i:nums){
            if(i==max) cnt++;
        }
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            if(i==max) continue;
            else{
                set.add(i);
            }
        }


        
        if(cnt==2 && set.size()==n-2 && n==max+1 ){
            return true;
        }

        return false;

        
    }
}


