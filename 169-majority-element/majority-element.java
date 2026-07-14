class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,el=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }else if(el==nums[i]) cnt++;
            else cnt--;
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(el==nums[i]) cnt1++;
        }
        if(cnt1>n/2){
            return el;
        }
        return -1;
    }
}

// class Solution {
//     public int majorityElement(int[] nums) {
//        Map<Integer,Integer>map=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        } 
//        int t=nums.length/2;
//        for(int i:map.keySet()){
//         if(map.get(i)>t){
//             return i;
//         }
//        }
//        return -1;
//     }
// }
// //tc=o(n)+o(n)
// //sc=o(n)