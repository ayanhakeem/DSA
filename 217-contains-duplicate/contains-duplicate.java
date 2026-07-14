class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>st=new HashSet<>();
        int n=nums.length;
        for(int i:nums){
            st.add(i);
        }
        return st.size()!=n;
    }
}