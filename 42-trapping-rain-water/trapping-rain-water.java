class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lm=0,rm=0,tp=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=lm){
                    lm=height[l];
                }else{
                    tp+=lm-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rm){
                    rm=height[r];
                }else{
                    tp+=rm-height[r];
                }
                r--;
            }
        }
        return tp;

    }
}

// class Solution {
//     public int trap(int[] height) {
//         int n=height.length;
//         int leftmax[]=new int[n];
//         leftmax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftmax[i]=Math.max(height[i],leftmax[i-1]);
//         }
//         //right max
//         int rightmax[]=new int[n];
//         rightmax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i]=Math.max(height[i],rightmax[i+1]);
//         }

//         int tp=0;
//         for(int i=0;i<n;i++){
//             int wl=Math.min(leftmax[i],rightmax[i]);
//             tp+=wl-height[i];
//         }
//         return tp;
        
//     }
// }

///first find left max and right max 
//then water trapped means for current wall in r and l which is min wall that much water hold then min(l,r)-ht[i] add into tp return tp at last