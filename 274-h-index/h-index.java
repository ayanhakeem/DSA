class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<n;i++){
            int papers=n-i;//right side papers
            if(papers<=citations[i]){
                return papers;
            }
        }
        return 0;
        
    }
}











//brute force
// class Solution {
//     public boolean atleast(int h,int citations[]){
//         int n=citations.length;
//         int c=0;
//         for(int i=0;i<n;i++){
//             if(citations[i]>=h){
//                 c++;
//             }
//         }
//         if(c>=h) return true;

//         return false;

//     }
//     public int hIndex(int[] citations) {
//         int n=citations.length;
//         int cnt=0;
//         for(int h=1;h<1000;h++){//citations
//             if(atleast(h,citations)){//papers
//                 cnt++;
//             }
//         }
//         return cnt;

//     }
// }