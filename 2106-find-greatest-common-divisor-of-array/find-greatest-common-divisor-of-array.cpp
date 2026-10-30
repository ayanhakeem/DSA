class Solution {
public:
    int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    int findGCD(vector<int>& nums) {
       int maxe=nums[0];
       int mine=nums[0];
       for(int i=0;i<nums.size();i++){
        mine=min(nums[i],mine);
        maxe=max(maxe,nums[i]);
       } 

       return gcd(mine,maxe);
    }
};