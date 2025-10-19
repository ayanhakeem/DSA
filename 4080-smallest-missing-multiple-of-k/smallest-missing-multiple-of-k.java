class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=0;
        for(int i=1;i<1e9;i++){
           if(!set.contains(i*k)){
             ans=i*k;
             break;
           }
        }
        return ans;

    }
}