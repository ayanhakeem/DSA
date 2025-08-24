class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);//max heap
        for(int i:stones){
            pq.offer(i);//o(n)
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y) pq.offer(x-y);
        }
        return pq.isEmpty()?0:pq.poll();

        
    }
}