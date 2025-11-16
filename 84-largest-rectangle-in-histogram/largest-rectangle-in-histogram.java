class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        int max=0;
        Stack<Integer>st=new Stack<>();

        //nsr
        for(int i=n-1;i>=0;i--){
          while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
          } 
          if(st.isEmpty()){
            nsr[i]=n;
          }else{
            nsr[i]=st.peek();
          }
          st.push(i);
        }

        st=new Stack<>();
    //nsl
        for(int i=0;i<n;i++){
          while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
          } 
          if(st.isEmpty()){
            nsl[i]=-1;
          }else{
            nsl[i]=st.peek();
          }
          st.push(i);
        }
       

        for(int i=0;i<n;i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            max=Math.max(max,area);
        }
        return max;
        
    }
}