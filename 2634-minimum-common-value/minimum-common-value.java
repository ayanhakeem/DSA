class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
}
//tc=o(n)
//sc=o(1)

// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         int min=Integer.MAX_VALUE;
//         Map<Integer,Integer>map1=new HashMap<>();
//         Map<Integer,Integer>map2=new HashMap<>();
//         for(int i:nums1){
//             map1.put(i,map1.getOrDefault(i,0)+1);
//         }
//         for(int i:nums2){
//             if(map1.containsKey(i)){
//                 min=Math.min(min,i);
//             }
//         }
        
//         return (min!=Integer.MAX_VALUE?min:-1);
//     }
// }

// //tc=o(n)+o(n)
// //sc=o(1)