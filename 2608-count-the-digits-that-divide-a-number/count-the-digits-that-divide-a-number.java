
import java.util.*;

class Solution {
    public int countDigits(int num) {

        int cnt = 0;
        int original = num;


        while (num > 0) {

            int ld = num % 10;

            if (ld != 0 && original % ld == 0) {
                cnt++;
            }

            num /= 10;
        }

        return cnt;
    }
}
