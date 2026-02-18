class Solution {

    public boolean isprime(int n){
        if(n==1) return false;;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:map.values()){
            if(isprime(i)) return true;
        }

        return false;


        
    }
}