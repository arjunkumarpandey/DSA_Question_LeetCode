import java.util.Hashtable;
class Solution {
    public int minOperations(int[] nums, int x) {
        Hashtable<Integer, Integer> h = new Hashtable<>();
        int sum = 0;
        h.put(0, -1);
        int longestSubArray = Integer.MIN_VALUE;

        for (int i = 0; i <nums.length; i++) {
            sum += nums[i];
            h.put(sum, i);
        }
        if (sum < x) return -1;

        int remainingSum = sum - x;
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int findSum = sum - remainingSum;
            if (h.containsKey(findSum)) {
                int index = h.get(findSum);
                longestSubArray = Math.max(longestSubArray, i - index);
            }
        }
        return longestSubArray == Integer.MIN_VALUE ? -1 : (nums.length - longestSubArray);
    }
}