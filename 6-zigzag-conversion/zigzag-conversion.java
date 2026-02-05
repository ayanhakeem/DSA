class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows){//base case
            return s;
        }

        int n = numRows;
        StringBuilder rows[]=new StringBuilder[numRows];
        for(int i=0;i<n;i++){
            rows[i]=new StringBuilder();
        }
        int row=0;
        boolean isgoingdown=true;

        for(char c:s.toCharArray()){
            rows[row].append(c);


            if(row==0){
                isgoingdown=true;
            }else if(row==n-1){
                isgoingdown=false;
            }

            row+=isgoingdown?1:-1;
        }


        StringBuilder ans=new StringBuilder();
        for(StringBuilder r:rows){
            ans.append(r);
        }

        return ans.toString();
    }
}
//tc
        
