class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int k=2;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[k-2]){
                nums[k++]=nums[i];
            }
        }
        return k;
        
    }
}











//brute force tc=o(n)+o(n^2) sc=o(n)

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
//         int n=nums.length;

//         for(int i=0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }

//         int k=0;
//         for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//             int v=entry.getKey();
//             int f=Math.min(2,entry.getValue());

//             for(int i=0;i<f;i++){
//                 nums[k++]=v;
//             }

            
//         }

//         return k;





        
//     }
// }