class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int n=operations.length;
        for(String op:operations){
            if(op.equals("X++") || op.equals("++X")){
                x=x+1;
            }else if(op.equals("--X") || op.equals("X--")){
                x=x-1;
            }else{
                continue;
            }
        }
        return x;
        
    }
}