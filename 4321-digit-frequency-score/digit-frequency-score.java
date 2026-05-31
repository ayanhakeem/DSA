class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n=n/10;
        }
        return sum;
    }
}

// class Solution {
//     public int digitFrequencyScore(int n) {
//         Map<Integer,Integer>map=new HashMap<>();
//         while(n>0){
//             int d=n%10;
//             map.put(d,map.getOrDefault(d,0)+1);
//             n=n/10;
//         }
//         int sum=0;
//         for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//             int k=entry.getKey();
//             int v=entry.getValue();
//             sum+=k*v;
//         }
//         return sum;
//     }
// }

// //tc=o(n)+o(n)
// //sc=o(n