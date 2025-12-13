class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int k=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int v=entry.getKey();
            int f=Math.min(2,entry.getValue());

            for(int i=0;i<f;i++){
                nums[k++]=v;
            }

            
        }

        return k;





        
    }
}