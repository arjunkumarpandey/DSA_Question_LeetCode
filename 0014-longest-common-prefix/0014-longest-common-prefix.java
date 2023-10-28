class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
            return "";
        }
        
        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }
}