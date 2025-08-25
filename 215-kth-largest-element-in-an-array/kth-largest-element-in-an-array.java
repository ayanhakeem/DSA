class Solution {
    public int findKthLargest(int[] nums, int k) {
       //using minn heap we can solve 
       //we maintain k size min heap at every step on iterating nums if minheap.size()>k poll(0) then at last we have k size min heap and then min.peek() is our kTh lagest element in min heap largest elemenst will be at last smallest at top so if k size minheap is there we can fet kth smallest ele
       PriorityQueue<Integer>minheap=new PriorityQueue<>();
       for(int i:nums){
        minheap.add(i);
        if(minheap.size()>k){
            minheap.poll();
        }
       }
       return minheap.peek();//top element of minheap of k size

    }
}
//TC = O(n log k)
//SC = O(k)