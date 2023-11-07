class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        StringBuilder numericPart = new StringBuilder();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        boolean positive = s.charAt(i) == '+';
        boolean negative = s.charAt(i) == '-';

        if (positive) {
            i++;
        }
        if (negative) {
            i++;
        }

        while (i < n) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                numericPart.append(c);
                i++;
            } else {
                break;
            }
        }

        if (numericPart.length() == 0) {
            return 0;
        }

        long res = 0L;
        try {
            res = Long.parseLong(numericPart.toString());
        } catch (NumberFormatException e) {
            if (negative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        if (negative) {
            res = -res;
        }

        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) res;
    }
}
