class Solution {
    public int minCostToMoveChips(int[] position) {
        int cnteven=0,cntodd=0;
        int n=position.length;
        for(int i=0;i<n;i++){
            if(position[i]%2==0){
                cnteven++;
            }else{
                cntodd++;
            }
        }
        return Math.min(cnteven,cntodd);
    }
}