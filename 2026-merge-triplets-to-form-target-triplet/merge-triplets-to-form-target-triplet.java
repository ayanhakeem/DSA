// class Solution {
//     public boolean mergeTriplets(int[][] triplets, int[] target) {
//        Set<Integer>good=new HashSet<>();
//        for(int t[]:triplets){
//          if(t[0]>target[0] || t[1]>target[1] || t[2]>target[2]){
//             continue;
//          }
//          for(int i=0;i<t.length;i++){
//             if(t[i]==target[i]){
//                 good.add(i);
//             }
//          }
//        }
//        return good.size()==3;
//     }
// }
class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean a = false, b = false, c = false; 

        for (int i = 0; i < triplets.length; i++) {
            if (triplets[i][0] > target[0] || 
                triplets[i][1] > target[1] ||
                triplets[i][2] > target[2]) {
                    continue;
                }
            
            for (int j = 0; j < 3; j++) {
                if (triplets[i][j] == target[j]) {
                    if (j == 0) a = true; 
                    if (j == 1) b = true; 
                    if (j == 2) c = true; 
                }
            }
        }

        return a && b && c;
    }
}