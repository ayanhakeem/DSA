class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        if(n<2) return nums;
        List<Integer>a1=new ArrayList<>();
        List<Integer>a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(a1.get(a1.size()-1)>a2.get(a2.size()-1)){
                a1.add(nums[i]);
            }else{
                a2.add(nums[i]);
            }
        }
        List<Integer>res=new ArrayList<>();
        for(int i:a1){
            res.add(i);
        }
        for(int i:a2){
            res.add(i);
        }
        

        int ans[]=new int[res.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=res.get(i);
        }

        return ans;


    }
}