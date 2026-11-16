class Solution {
    public int numOfSubarrays(int[] arr) {
      int n=arr.length;
      int mod = 1000000007;
      int cnt=0;
      int evencnt=1;
      int oddcnt=0;
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum%2==1){
            cnt=(cnt+evencnt)%mod;;
            oddcnt++;
        }else{
            cnt=(cnt+oddcnt)%mod;
            evencnt++;
        }
      }
      return cnt;
    }
}
// class Solution {
//     public int numOfSubarrays(int[] arr) {
//       int n=arr.length;
//       int cnt=0;
//       for(int i=0;i<n;i++){
//         int sum=0;
//         for(int j=i;j<n;j++){
//             sum+=arr[j];
//             if(sum%2==1){
//                 cnt++;
//             }
//         }
//       }
//       return cnt; 
//     }
// }