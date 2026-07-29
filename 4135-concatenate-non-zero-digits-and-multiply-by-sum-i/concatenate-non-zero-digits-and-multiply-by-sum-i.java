class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long res=0;
        while(n>0){
            long ld=n%10;
            if(ld!=0){
                sum+=ld;
                res=ld+res*10;
            }
            n/=10;
        }
        long newnum=res;
        long finalres=0;
        while(newnum>0){
            long ld=newnum%10;
            finalres=ld+finalres*10;
            newnum=newnum/10;
        }

        return finalres*sum;


    }
}

// class Solution {
//     public long sumAndMultiply(int n) {
//         Stack<Integer>st=new Stack<>();
//         long sum=0;
//         while(n>0){
//             int ld=n%10;
//             if(ld!=0){
//                 st.push(ld);
//                 sum+=ld;
//             }

//             n/=10;
//         }

//         long res=0;
//         while(!st.isEmpty()){
//             res=st.pop()+res*10;
//         }

//         return res*sum;


//     }
// }
//tc=o(n)
//sc=o(n)