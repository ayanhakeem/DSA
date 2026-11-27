
class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {

        int cnt1 = 0, cnt2 = 0;
        int n = nums.size();

        int e1 = INT_MIN;
        int e2 = INT_MIN;

        // Step 1: Find potential candidates
        for(int i = 0; i < n; i++) {

            if(cnt1 == 0 && e2 != nums[i]) {
                cnt1 = 1;
                e1 = nums[i];
            }
            else if(cnt2 == 0 && e1 != nums[i]) {
                cnt2 = 1;
                e2 = nums[i];
            }
            else if(e1 == nums[i]) {
                cnt1++;
            }
            else if(e2 == nums[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        // Step 2: Verify candidates
        vector<int> ans;
        cnt1 = 0;
        cnt2 = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] == e1) cnt1++;
            if(nums[i] == e2) cnt2++;
        }

        int mine = (n / 3) + 1;

        if(cnt1 >= mine) ans.push_back(e1);
        if(cnt2 >= mine) ans.push_back(e2);

        return ans;
    }
};
