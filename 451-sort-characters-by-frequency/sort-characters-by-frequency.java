class Solution {
    class Pair{
        char c;
        int val;

        Pair(char c,int val){
            this.c=c;
            this.val=val;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.val-a.val);//max heap
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }

        StringBuilder sb=new StringBuilder();

        while(!pq.isEmpty()){
            Pair p=pq.poll();
            for(int i=0;i<p.val;i++){
                sb.append(p.c);
            }
        }

        return sb.toString();

    }
}

//t-1 r-1 e-2