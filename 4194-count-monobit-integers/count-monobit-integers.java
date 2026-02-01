class Solution {
    private static boolean ismonotonic(String s){
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size() == 1;
    }
    public int countMonobit(int n) {
        int cnt=0;
        for(int i=0;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            if(ismonotonic(binary)){
                cnt++;
            } 
        }
        return cnt;
    }
}