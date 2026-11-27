class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int minsub=INT_MAX;
        int n=nums.size();
        int l=0,r=0;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                minsub=min(minsub,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return (minsub==INT_MAX?0:minsub);
    }
};