class Solution {
    public int maxNumberOfBalloons(String text) {
        int cnt=Integer.MAX_VALUE;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        
            return Math.min(
                Math.min(map.getOrDefault('b', 0), map.getOrDefault('a', 0)),
                Math.min(
                    Math.min(map.getOrDefault('l', 0) / 2, map.getOrDefault('o', 0) / 2),
                    map.getOrDefault('n', 0)
                )
        );
    }
}