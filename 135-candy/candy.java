class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        
        // Step 1: everyone gets at least 1 candy
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Step 2: left -> right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: right -> left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: sum total candies
        int sum = 0;
        for (int c : candies) {
            sum += c;
        }

        return sum;
    }
}























//my logic failed due to edge cases
// class Solution {
//     public int candy(int[] ratings) {
//         Map<Integer,Integer>map=new HashMap<>();
//         for(int i:ratings){
//             map.put(i,1);//assign to all atleast 1 candy
//         }

//         int n=ratings.length;

//         for(int i=1;i<n;i++){
//             if(ratings[i-1]>ratings[i]){
//                 map.put(ratings[i-1],map.get(ratings[i-1])+1);
//             }else{
//                 map.put(ratings[i],map.get(ratings[i])+1);  
//             }
//         }
        
//         int sum=0;

//         for(int i:map.values()){
//             sum+=i;
//         }
//         return sum;
//     }
// }