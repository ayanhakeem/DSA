class Solution {
public:
    int minMoves(vector<int>& nums) {
        int mine=INT_MAX;
        for(int i:nums){
            mine=min(mine,i);
        }

        int cnt=0;

        for(int i:nums){
            cnt+=i-mine;
        }

        return cnt;
    }
};