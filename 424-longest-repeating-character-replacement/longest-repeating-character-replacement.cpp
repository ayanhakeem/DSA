class Solution {
public:
    int characterReplacement(string s, int k) {
        int freq[26]={};
        int n=s.length();
        int res=0;
        int maxf=0;
        int l=0;
        for(int r=0;r<n;r++){
            freq[s[r]-'A']++;
            maxf=max(maxf,freq[s[r]-'A']);

            while((r-l+1)-maxf>k){//len-maxf>k how many replaces will have to do
                freq[s[l]-'A']--;
                l++;
            }
            res=max(res,r-l+1);
        }
        return res;
    }
};