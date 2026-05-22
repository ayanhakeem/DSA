class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return true;
        }

        return false;
    }
}

// class Solution {
//     public boolean search(int[] nums, int target) {
//         int si=0;
//         int ei=nums.length-1;
//         while(si<=ei){
//             int mid=si+(ei-si)/2;
//             if(nums[mid]==target){
//                 return  true;
//             }
//             //left part is sorted
//             else if(nums[si]<=nums[mid]){
//                 if(nums[si]<=target && target<=nums[mid]){//si<=target<=mid
//                 ei=mid-1;
//                 }else{
//                     si=mid+1;
//                 }
//                 //lest is not sorted right part is sorted
//             }else{
//                 if(nums[mid]<=target && target<=nums[ei]){
//                     si=mid+1;
//                 }else{
//                     ei=mid-1;
//                 }
//             }
//         }

//         return false;//not found
//     }
// }
// //tc=o(logn)
// //sc=o(1)