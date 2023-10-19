class Solution {
    public boolean winnerOfGame(String s) {
        int A = 0, B = 0; 
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'A' && s.charAt(i + 2) == 'A') {
                A++; 
            }
            if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'B') {
                B++; 
            }
        }
        return A > B;
    }
}
