class Solution {
    public int countHomogenous(String s) { 
        int n = s.length();
        int res = 1;
        int ans = 1;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                res++;
                ans = (ans + res) % 1000000007;
            } else {
                res = 1;
                ans = (ans + res) % 1000000007;
            }
            i++;
        }

        return ans % 1000000007;
    }
}
