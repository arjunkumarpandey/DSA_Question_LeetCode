class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            if (s.charAt(right) == ' ') {
                for (int i = right - 1; i >= left; i--) {
                    sb.append(s.charAt(i));
                }
                sb.append(' '); 
                left = right + 1; 
            }
            right++;
        }
        for (int i = right - 1; i >= left; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}