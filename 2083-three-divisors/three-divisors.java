class Solution {
    public boolean isThree(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt==3;
    }
}




// class Solution {
//     public boolean isThree(int n) {
//         int cnt=0;
//         for(int m=1;m<=n;m++){
//            for(int k=1;k<=n;k++){
//                 if(m*k==n) cnt++;
//            } 
//         }
//         return cnt==3;
//     }
// }
// n=2
// m=1 k=1 
// m=1 k=2 a=2 cnt=1
// m=2 k=1 cnt=2
// m=2 k=2 cnt=2


// n=4
// m=1 k=1 r=1
// m=1 k=2 a=2 cnt=1
// m=1 k=3 a=3 cnt=1
// m=1 k=4  a=4 cnt=2

// m=2 k=1 ,k=2,k=3,k=4 cnt=3
// m=3 k=1 ,k=2,k=3,k=4 cnt=3
// m=4 k=1,2,3,4 cnt=4
