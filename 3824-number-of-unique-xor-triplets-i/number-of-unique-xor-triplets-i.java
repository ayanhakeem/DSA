class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int m=0;
        for(int i:nums){
            m|=i;
        }
        return m+1;
    }
}

// class Solution {
//     public int uniqueXorTriplets(int[] nums) {
//         int n=nums.length;
       
//         Set<Integer>set=new HashSet<>();
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 for(int k=j;k<n;k++){
//                     if(i<=j && j<=k){
//                         int xor=nums[i]^nums[j]^nums[k];
//                         set.add(xor);
//                     }
//                 }
//             }
//         }
//         return set.size();
//     }
// }