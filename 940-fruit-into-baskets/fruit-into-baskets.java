class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=fruits.length;
        int l=0,r=0;
        int max=0;
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                int freq=map.get(fruits[l]);
                if(freq==1){
                    map.remove(fruits[l]);
                }else{
                    map.put(fruits[l],freq-1);
                }
                l++;
            }
            int len=r-l+1;
            max=Math.max(max,len);
            r++;
        }
        return max;
    }
}