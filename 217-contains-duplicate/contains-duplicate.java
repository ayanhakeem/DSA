class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n=nums.length;
        Set<Integer>st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        if(st.size()!=n) return true;
        else return false;
    }
}