class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}