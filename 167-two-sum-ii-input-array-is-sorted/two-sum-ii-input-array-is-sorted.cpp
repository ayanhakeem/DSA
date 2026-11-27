class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int n=numbers.size();
        int l=0,h=n-1;
        vector<int>ans;
        while(l<=h){
            int s=numbers[l]+numbers[h];
            if(s==target){
                ans.push_back(l+1);
                ans.push_back(h+1);
                return ans;
            }else if(s<target){
                l++;
            }else{
                h--;
            }
        }
        return ans;
    }
};