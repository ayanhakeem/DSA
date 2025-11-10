class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(a->a[1]));//based on 1st col sort in asending
        int max=1;
        int n=pairs.length;
        int lastend=pairs[0][1];//last selected end

        for(int i=1;i<n;i++){
            if(pairs[i][0]>lastend){
                max++;
                lastend=pairs[i][1];
            }
        }
        return max;
        
    }
}