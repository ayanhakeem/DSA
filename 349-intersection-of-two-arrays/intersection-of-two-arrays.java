class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        set1.retainAll(set2);//store comman ele of both in set1

        int res[]=new int[set1.size()];
        int idx=0;
        for(int i:set1){
            res[idx++]=i;
        }
        return res;
        
    }
}