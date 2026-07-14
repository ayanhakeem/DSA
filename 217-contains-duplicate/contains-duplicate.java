class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>st=new HashSet<>();
        int n=nums.length;
        if(n<=1) return false;
        for(int i:nums){
            if(st.contains(i)){
                return true;
            }else{
                st.add(i);
            }
        }
        return false;
    }
}