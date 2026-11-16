
class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            StringBuilder sb = new StringBuilder();

            int i = 0;

            while (i < s.length()) {

                int sum = 0;
                int count = 0;

                while (i < s.length() && count < k) {

                    int num = s.charAt(i) - '0';

                    sum += num;

                    i++;
                    count++;
                }

                sb.append(sum);
            }

            s = sb.toString();
        }

        return s;
    }
}
