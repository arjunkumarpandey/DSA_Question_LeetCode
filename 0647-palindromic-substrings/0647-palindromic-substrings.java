class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < n; j++) {
                str.append(s.charAt(j));
                StringBuilder strRev = new StringBuilder(str);
                strRev.reverse();
                if (str.toString().equals(strRev.toString())) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
