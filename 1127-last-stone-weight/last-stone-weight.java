class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        int n=stones.length;
        for(int i:stones){
            pq.offer(i);//o(n*logk)
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x==y){
                continue;
            }else{
                if(x>y){
                    pq.offer(x-y);
                }else{
                    pq.offer(y-x);
                }
            }
        }
        return pq.size()==1?pq.peek():0;
    }
}