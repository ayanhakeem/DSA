class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String>set=new HashSet<>();//o(2^k)
        int n=s.length();
        int need=1<<k;//2^k
        if(n<need+k-1) return false;//means tot windows it should be n-k+1>=2^k  rearrange equation n>=a^k_k-1;
        
        for(int i=0;i<=n-k;i++){//o(n-k)
           String sub=s.substring(i,i+k);
           set.add(sub);//o(1)
        }

        return set.size()==need;
        
    }
}