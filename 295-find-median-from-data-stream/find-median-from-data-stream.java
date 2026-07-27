class MedianFinder {
    PriorityQueue<Integer>min=new PriorityQueue<>();//right min heap
    PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());//left max heap

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        max.offer(num);//add into left max heap
        min.offer(max.poll());//add into right min heap for balance
        if(min.size()>max.size()){//we have to maintain max right heap > than right min heap of diff 1
            max.offer(min.poll());
        }
        
    }
    
    public double findMedian() {
        if(max.size()>min.size()) return max.peek();//if odd count or means if maintain left max heap > greater than right min heap of diff 1 not more tgan diff 1
        return (max.peek()+min.peek())/2.0d;//if even count
        
    }
}
//intution behind median=middle of sorted array so if we take ith ele left of i are smaller and right are larger so we want only left half max and right half smaller use max and mi heap to find max, min thenbalance  the 2 heaps should not grow larger max>min no balance them then if total ele are even it is avg of max.peek()+min.peek() if it is odd return max.peek() /min.peek() according to ur logic

//tc=o(logn) for inset in heap per num
//sc=o(n)