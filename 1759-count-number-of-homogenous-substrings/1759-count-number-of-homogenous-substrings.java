class Solution {
    public int countHomogenous(String s) { 
        int n=s.length();
        int res = 1;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                res++;
                ans = (ans + res) % 1000000007;
            } else {
                res = 1;
                ans = (ans + res) % 1000000007;
            }
        }
        return ans%1000000007;
    }
}
