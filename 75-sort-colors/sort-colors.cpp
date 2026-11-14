class Solution {
public:
    void swap(vector<int>&nums,int &i,int &j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    void sortColors(vector<int>& nums) {
       int l=0,m=0,r=nums.size()-1;
        while(m<=r){
            if(nums[m]==2){
                swap(nums,m,r);
                r--;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,l);
                l++;
                m++;
            }
        } 
    } 
};