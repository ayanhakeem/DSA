class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
       int xr=0;
       unordered_map<int,int>mp;
       for(int i:nums){
        mp[i]++;
       } 
       for(auto i:mp){
        if(i.second==2){
            xr^=i.first;
        }
       }
       return xr;
    }
};