class Solution {
    public void func(int idx,int xor,int nums[],int n,ArrayList<Integer>subsetsum){
        if(idx==n){
            subsetsum.add(xor);
            return;
        }
        func(idx+1,xor^nums[idx],nums,n,subsetsum);
        func(idx+1,xor,nums,n,subsetsum);
    }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        ArrayList<Integer>subsetsum=new ArrayList<>();
        func(0,0,nums,n,subsetsum);
        for(int i=0;i<subsetsum.size();i++){
            totalsum+=subsetsum.get(i);

        }
        return totalsum;
    }
}