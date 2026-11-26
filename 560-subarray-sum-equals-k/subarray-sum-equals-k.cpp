class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int cnt=0;
        unordered_map<int,int>mp;
        mp[0]=1;
        int sum=0;
        for(int i:nums){
            sum+=i;
            int rem=sum-k;
            if(mp.find(rem)!=mp.end()){
                cnt+=mp[rem];
            }
            mp[sum]++;
        }
        return cnt;
    }
};