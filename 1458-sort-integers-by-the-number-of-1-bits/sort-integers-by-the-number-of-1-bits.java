class Solution {
    public static int countbits(int n){
        int res=0;
        while(n>0){
            if((n&1)==1){
                res++;
            }
            n=n>>1;
        }
        return res;
        
    }
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Integer ans[]=new Integer[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }

        Arrays.sort(ans,(a,b)->{
            int bitsa=countbits(a);
            int bitsb=countbits(b);

            if(bitsa==bitsb) return a-b;//sort by value if tie
            return bitsa-bitsb;
        });

        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }

        return arr;
        
    }
}
