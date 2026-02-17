class Solution {
    public String reorganizeString(String s) {
        int charcount[]=new int[26];
        for(char c:s.toCharArray()){
            charcount[c-'a']++;
        }
        //storing in pq char,freq
        var pq=new PriorityQueue<int[]>((a,b)->Integer.compare(b[1],a[1])); 
        for(int i=0;i<26;i++){
            if(charcount[i]>0){
                pq.offer(new int[] {i+'a',charcount[i]});//char,freq
            }
        }  
        StringBuilder sb=new StringBuilder();
        int block[]=pq.poll();
        sb.append((char)block[0]);
        block[1]--;
        while(!pq.isEmpty()){
            int next[]=pq.poll();
            sb.append((char)next[0]);
            next[1]--;

            if(block[1]>0){
                pq.offer(block);//after poll block is it has freq then again push into pq
            }
            block=next;//block to next after append next
        }   
        if(block[1]>0) return "";
        else return sb.toString(); 
    }
}