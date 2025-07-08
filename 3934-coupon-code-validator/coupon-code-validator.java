import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> validCoupons = new ArrayList<>();

        Map<String, Integer> businessOrder = new HashMap<>();
        businessOrder.put("electronics", 0);
        businessOrder.put("grocery", 1);
        businessOrder.put("pharmacy", 2);
        businessOrder.put("restaurant", 3);

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+$");

        List<Coupon> coupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (code[i] != null && !code[i].isEmpty() &&
                pattern.matcher(code[i]).matches() &&
                businessOrder.containsKey(businessLine[i]) &&
                isActive[i]) {

                coupons.add(new Coupon(code[i], businessLine[i]));
            }
        }

        coupons.sort((a, b) -> {
            int cmp = Integer.compare(businessOrder.get(a.businessLine), businessOrder.get(b.businessLine));
            if (cmp == 0) {
                return a.code.compareTo(b.code);
            }
            return cmp;
        });

        for (Coupon c : coupons) {
            validCoupons.add(c.code);
        }

        return validCoupons;
    }

    static class Coupon {
        String code;
        String businessLine;

        public Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
