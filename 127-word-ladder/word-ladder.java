class Solution {
    class Pair {
        String first;
        int second;
        public Pair(String first,int second) {
            this.first= first;
            this.second= second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));//new pair with step 1

        Set<String> st = new HashSet<>(wordList);
        st.remove(beginWord);//remove from the set once you added into q or visited

        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.poll();
            

            // If target word is found
            if (word.equals(endWord)) return steps;

            // Try changing every character
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] arr = word.toCharArray();
                    arr[i] = ch;
                    String newWord = new String(arr);
                    if (st.contains(newWord)) {
                        st.remove(newWord);
                        q.add(new Pair(newWord, steps + 1));
                    }
                }
                
            }
        }
        return 0;
    }
} 

//tc=o() 