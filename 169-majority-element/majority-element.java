class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       } 
       int t=nums.length/2;
       for(int i:map.keySet()){
        if(map.get(i)>t){
            return i;
        }
       }
       return -1;
    }
}
//tc=o(n)+o(n)
//sc=o(n)