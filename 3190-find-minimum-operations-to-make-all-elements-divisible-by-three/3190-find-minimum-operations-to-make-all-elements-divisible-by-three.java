class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int remainder = num % 3;
            
            if (remainder == 1) {
                result += 1;
            } else if (remainder == 2) {
                result += 1; 
            }
        } 
        return result;
    }
}
