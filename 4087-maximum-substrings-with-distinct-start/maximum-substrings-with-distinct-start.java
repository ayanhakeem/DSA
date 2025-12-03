class Solution {
    public int maxDistinct(String s) {
        Set<Character>set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            set.add(ch);
        }

        return set.size();

        
    }
}