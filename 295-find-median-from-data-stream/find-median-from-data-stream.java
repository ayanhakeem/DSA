class MedianFinder {
    PriorityQueue<Integer>max=new PriorityQueue<>();
    PriorityQueue<Integer>min=new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(min.size()>max.size()){
            max.offer(min.poll());
        }
        
    }
    
    public double findMedian() {
        if(max.size()>min.size()) return max.peek();
        return (max.peek()+min.peek())/2.0d;
        
    }
}
//intution behind median=middle of sorted array so if we take ith ele left of i are smaller and right are larger so we want only left half max and right half smaller use max and mi heap to find max, min thenbalance  the 2 heaps should not grow larger max>min no balance them then if total ele are even it is avg of max.peek()+min.peek() if it is odd return max.peek() /min.peek() according to ur logic

//tc=o(logn) for inset in heap per num
//sc=o(n)