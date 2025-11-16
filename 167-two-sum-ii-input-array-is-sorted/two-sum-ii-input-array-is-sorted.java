class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0,r=n-1;
        
        
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                int idx1=l+1;
                int idx2=r+1;
                return new int[]{idx1, idx2};
            }else if(numbers[l]+numbers[r]<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{};


        
    }
}