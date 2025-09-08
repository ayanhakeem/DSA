class Solution {
    public int minOperations(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==1){
            return 0;
        }

        return 1;


        
    }
}