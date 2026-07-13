class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int k=set.size();
        int i=0;
        for(int x:set){
            nums[i]=x;
            i++;
        }
        return k;
    }
}