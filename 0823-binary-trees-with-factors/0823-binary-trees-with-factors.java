public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = 1000000007;
        Arrays.sort(arr);
        Map<Integer, Long> count = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i], 1L);
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int k = arr[i] / arr[j];
                    if (count.containsKey(k)) {
                        count.put(arr[i], count.get(arr[i]) + count.get(arr[j]) * count.get(k));
                    }
                }
            }
        }

        long sum = 0;
        for (int key : count.keySet()) {
            sum = (sum + count.get(key)) % mod;
        }
        
        return (int) sum;
    }
}