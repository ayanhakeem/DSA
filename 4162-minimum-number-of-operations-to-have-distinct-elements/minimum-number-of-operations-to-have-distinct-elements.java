class Solution {
    public int minOperations(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(set.contains(nums[i])){//if have seen before/duplicate
                int len=i+1;//if duplicate found delete from 0 to idx+1 
                return (len/3)+((len%3)!=0?1:0);//len/3 means 3 ele can remove at max and len%3!=0 means they are left more elemts after remove 3 ele means 1 opertation done of deleted 3 ele
            }else{
                set.add(nums[i]);
            }
        }

        return 0;
        

        
    }
}