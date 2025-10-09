class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        Set<Integer>st=new HashSet<>();
        for(int i:nums){
            if(i==0) continue;
            else st.add(i);
        }
        return st.size();
        
    }
}