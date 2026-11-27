
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {

        int n = intervals.size();

        sort(intervals.begin(), intervals.end());

        if(n == 1) return intervals;

        vector<vector<int>> res;

        int st = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < n; i++) {

            if(intervals[i][0] <= end) {
                end = max(end, intervals[i][1]);
            }
            else {
                res.push_back({st, end});

                st = intervals[i][0];
                end = intervals[i][1];
            }
        }

        res.push_back({st, end});

        return res;
    }
};
