class Solution {
    public int maxDigitRange(int[] nums) {
        int l=nums.length;
        int maxd=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            int n=nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(n>0){
                int ld=n%10;
                max=Math.max(max,ld);
                min=Math.min(min,ld);
                n/=10;
            }
            int diff=max-min;
            maxd=Math.max(maxd,diff);
        }
        int sum=0;
        for(int i=0;i<l;i++){
            int n=nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(n>0){
                int ld=n%10;
                max=Math.max(max,ld);
                min=Math.min(min,ld);
                n/=10;
            }
            int diff2=max-min;
            if(diff2==maxd){
                sum+=nums[i];
            }
        }


       

        return sum;

        

        
    }
}