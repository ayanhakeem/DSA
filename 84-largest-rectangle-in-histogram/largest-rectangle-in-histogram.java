class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        Stack<Integer>st=new Stack<>();//stores idx not values

        //nsr
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();//if we found any ele with bar ht >= curr bar ht then we pop bcoz we want smaller on the stack 
            }
            if(st.isEmpty()){
                nsr[i]=n;//if st.isempty then we assign as n for smaller whole width will be coverd we havent found any smaller in right for curr
            }else{
                nsr[i]=st.peek();//storing idx only not values
            }
            st.push(i);//push idx comman in all opearions 
        }
         //nsl
        st=new Stack<>();//make st empty
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();//if we found any ele with bar ht >= curr bar ht then we pop bcoz we want smaller on the stack 
            }
            if(st.isEmpty()){
                nsl[i]=-1;//if st.isempty then we assign as -1 for smaller whole width we havent found any smaller in left for curr so -1
            }else{
                nsl[i]=st.peek();//storing idx only not values
            }
            st.push(i);//push idx comman in all opearions 
        }

        //area for each bar
        int maxarea=0;
        for(int i=0;i<n;i++){
            int ht=heights[i];
            int area=ht*(nsr[i]-nsl[i]-1);
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}

//tc=o(n)
//sc=o(n)