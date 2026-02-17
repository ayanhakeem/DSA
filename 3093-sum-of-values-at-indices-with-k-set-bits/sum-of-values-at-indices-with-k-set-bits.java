class Solution {
    public int countbits(int n){
        int cnt=0;
        while(n>0){
            if((n&1)!=0){
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(countbits(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}