class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List<Integer>pos:map.values()){
            if(pos.size()<3)  continue;
            for(int i=0;i+2<pos.size();i++){
                int a=pos.get(i);
                int c=pos.get(i+2);//last el means 3rd ele
                int d=2*(c-a);//expand formula of diffrence
                min=Math.min(min,d);
            }
        }
        return (min != Integer.MAX_VALUE ? min : -1);

        
    }
}