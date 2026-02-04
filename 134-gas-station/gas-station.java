class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int stidx=0;
        int currgas=0;
        int n=gas.length;
        int totgas=0;
        int totcost=0;
        for(int i=0;i<n;i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }
        if(totgas<totcost) return -1;
        for(int i=0;i<n;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                stidx=i+1;
                currgas=0;
            }
        }
        return stidx;
        
    }
}