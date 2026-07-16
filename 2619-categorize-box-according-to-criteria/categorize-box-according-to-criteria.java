class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        long volume = (long) length * width * height;

        boolean bulky = false;
        boolean heavy = false;

        if (length >= 10000 || width >= 10000 ||
            height >= 10000 || volume >= 1000000000L) {
            bulky = true;
        }

        if (mass >= 100) {
            heavy = true;
        }

        if (bulky && heavy) {
            return "Both";
        }

        if (bulky && !heavy) {
            return "Bulky";
        }

        if (!bulky && heavy) {
            return "Heavy";
        }

        return "Neither";
    }
}