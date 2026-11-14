class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int>r;
        int ri = 0;
        // store index
        deque < int > q;
        for (int i = 0; i < n; i++) {
            // remove numbers out of range k
            if (!q.empty() && q.front() == i - k) {//or peek() can use
                q.pop_front();
            }
            // remove smaller numbers in k range as they are useless in boundry
            while (!q.empty() && nums[q.back()] < nums[i]) {
                q.pop_back();
            }

            q.push_back(i);
            if (i >= k - 1) {//starting of sliding window
                r.push_back(nums[q.front()]);
            }
        }
        return r;
    }
};