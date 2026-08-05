class Solution {
    public void findsubset(int i,int nums[],List<Integer>subset,List<List<Integer>>anslist){
        if(i>=nums.length){
            anslist.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        findsubset(i+1,nums,subset,anslist);
        subset.remove(subset.size()-1);
        findsubset(i+1,nums,subset,anslist);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>anslist=new ArrayList<>();
        List<Integer>subset=new ArrayList<>();
        findsubset(0,nums,subset,anslist);
        return anslist;
    }
}

// class Solution {
//     void findsubset(int idx,int nums[],List<Integer>ds,List<List<Integer>>anslist){
//         anslist.add(new ArrayList<>(ds));
//         for(int i=idx;i<nums.length;i++){
            
//             ds.add(nums[i]);
//             findsubset(i+1,nums,ds,anslist);
//             ds.remove(ds.size()-1);
//         }
//     }
    
//     public List<List<Integer>> subsets(int[] nums) {
//          Arrays.sort(nums);
//         List<List<Integer>>anslist=new ArrayList<>();
//         findsubset(0,nums,new ArrayList<>(),anslist);
//         return anslist;

        
//     }
// }