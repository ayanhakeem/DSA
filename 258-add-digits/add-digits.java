class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9;
    }
}


// class Solution {
//     public int addDigits(int num) {
//         while(num>9){
//             int sum=0;
//             while(num>0){
//                 int ld=num%10;
//                 sum+=ld;
//                 num/=10;
//             }
//             num=sum;
//         }
//         return num;
//     }
// }

//tc=o(n)
//sc=o(1)