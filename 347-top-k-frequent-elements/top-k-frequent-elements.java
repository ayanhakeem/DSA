class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }
}

//tc=o(nlogk)+o(n) //log k means heap size is k ele max
//sc=o(logk) heap and o(n) map and return res array o(k) size