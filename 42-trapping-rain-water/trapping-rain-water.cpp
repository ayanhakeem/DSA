class Solution {
public:
    int trap(vector<int>& height) {
        int l=0,r=height.size()-1;
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
};