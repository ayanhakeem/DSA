class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>st.peek()[0]){
                int pair[]=st.pop();
                ans[pair[1]]=i-pair[1];
            }
            st.push(new int[]{temperatures[i],i});
        }
       
        return ans;
    }
}

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n=temperatures.length;
//         int ans[]=new int[n];
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(temperatures[i]<temperatures[j]){
//                     ans[i]=j-i;
//                     break;
//                 }
//             }
//         }
//         return ans;
    
//     }
// }