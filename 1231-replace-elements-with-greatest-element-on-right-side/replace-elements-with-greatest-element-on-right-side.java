class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        ans[n-1]=-1;
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=max;
            max=Math.max(max,arr[i]);
        }
        return ans;
    }
}
// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n=arr.length;
//         int ans[]=new int[n];
//         ans[n-1]=-1;
//         for(int i=0;i<n-1;i++){
//             int max=Integer.MIN_VALUE;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]>max){
//                     max=arr[j];
//                 }
//             }
//             ans[i]=max;
//         }
//         return ans;
//     }
// }