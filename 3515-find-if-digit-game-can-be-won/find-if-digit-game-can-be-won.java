class Solution {
    public boolean canAliceWin(int[] nums) {
        int suma=0;
        int sumb=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                suma+=nums[i];
            }else{
                sumb+=nums[i];
            }
        }
        return (suma>sumb) || (sumb>suma)?true:false;
        
    }
}