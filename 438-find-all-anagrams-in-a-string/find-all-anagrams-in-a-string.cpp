class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int>ans;
        if(p.length()>s.length()) return ans;
        int hashp[26]={};
        int hashs[26]={};
        //p hashed
        for(int i=0;i<p.length();i++){
            hashp[p[i]-'a']++;
        }
        //1st window
        for(int i=0;i<p.length();i++){
            hashs[s[i]-'a']++;
        }
        //if equal
        if(equal(hashp,hashp+26,hashs)){
            ans.push_back(0);//0 idx added
        }
        //sliding window
        for(int i=p.length();i<s.length();i++){
            hashs[s[i-p.length()]-'a']--;//remove from starting idx bcoz window size should maintained ex=3 abc
            hashs[s[i]-'a']++;//added curr char freq

            //if equal
            if(equal(hashp,hashp+26,hashs)){
                ans.push_back(i-p.length()+1);
            }
        }
        return ans;
    }
};