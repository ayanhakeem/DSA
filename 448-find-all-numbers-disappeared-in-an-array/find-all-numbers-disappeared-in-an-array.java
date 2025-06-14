class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer>st=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        for(int i:nums){
            st.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}