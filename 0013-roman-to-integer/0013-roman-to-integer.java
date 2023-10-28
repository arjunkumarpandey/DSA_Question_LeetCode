class Solution {
    public int romanToInt(String s) {
       HashMap<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        
        int result = table.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (table.get(s.charAt(i)) < table.get(s.charAt(i + 1))) {
                result -= table.get(s.charAt(i));
            } else {
                result += table.get(s.charAt(i));
            }
        }
        return result;
    }
}