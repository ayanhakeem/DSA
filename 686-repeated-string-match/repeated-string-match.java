class Solution {
    public boolean issub(String a,String b){
        for(int i=0;i<=a.length()-b.length();i++){
            if(a.substring(i,i+b.length()).equals(b)){
                return true;
            }
        }
        return false;
    }
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        while(sb.length()<b.length()){//until a.length=b.length
            sb.append(a);
            cnt++;
        }

       if(sb.toString().contains(b)) return cnt;
        //extra adding  beacuse may b starts at other idx means we are repeting a until a.length()==b.length() so we assume as the b's starting idx starts from 0th idx of a but may starts from others so extra repetation required
        sb.append(a);
        cnt++;

        if(sb.toString().contains(b)){
            return cnt;
        }
        return -1;
    }
}


// class Solution {
//     public boolean issub(String a,String b){
//         for(int i=0;i<=a.length()-b.length();i++){
//             if(a.substring(i,i+b.length()).equals(b)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
//     public int repeatedStringMatch(String a, String b) {
//         StringBuilder sb=new StringBuilder();
//         int cnt=0;
//         while(sb.length()<b.length()){
//             sb.append(a);
//             cnt++;
//         }

//         if(issub(sb.toString(),b)){
//             return cnt;
//         }
//         //extra adding  beacuse may b starts at other idx means we are repeting a until a.length()==b.length() so we assume as the b's starting idx starts from 0th idx of a but may starts from others so extra repetation required
//         sb.append(a);
//         cnt++;

//         if(issub(sb.toString(),b)){
//             return cnt;
//         }
//         return -1;
//     }
// }