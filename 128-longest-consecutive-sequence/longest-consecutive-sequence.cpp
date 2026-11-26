class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
       unordered_set<int>st;
       int longest=0;
       for(int i:nums){
        st.insert(i);
       }
       for(int i:st){
        if(st.find(i-1)==st.end()){//not exist st ele
            int x=i;
            int cnt=1;
            while(st.find(x+1)!=st.end()){//exist
                x++;
                cnt++;
            }
            longest=max(longest,cnt);
        }
       }
       return longest;
    }
};