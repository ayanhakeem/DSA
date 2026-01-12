class Solution {
    public int residuePrefixes(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int c = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            int distinct = map.size();   
            int len = i + 1;             

            if (distinct == len % 3) {
                c++;
            }
        }
        return c;
    }
}
