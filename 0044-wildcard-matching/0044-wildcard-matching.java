class Solution {
    public boolean isMatch(String s, String p) 
    {
         int m = s.length();
    int n = p.length();
    boolean[][] T = new boolean[m + 1][n + 1];
    
    T[0][0] = true;
    
    for (int i = 1; i <= n; i++) {
        if (p.charAt(i - 1) == '*') {
            T[0][i] = T[0][i - 1];
        }
    }
    
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                T[i][j] = T[i - 1][j - 1];
            } else if (p.charAt(j - 1) == '*') {
                T[i][j] = T[i - 1][j] || T[i][j - 1];
            } else {
                T[i][j] = false;
            }
        }
    }
    
    return T[m][n];
}
}