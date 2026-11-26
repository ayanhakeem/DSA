class Solution {
public:
    int maxArea(vector<int>& height) {
        int l=0,r=height.size()-1;
        int mw=0;
        while(l<r){
            int h=min(height[l],height[r]);//smaller ht depend
            int w=r-l;
            int cw=w*h;
            mw=max(mw,cw);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return mw;
    }
};