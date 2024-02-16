class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
      int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : arr) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        int[] freqCount = new int[n + 1];
        int uniqueElements = mp.size();

        for (int count : mp.values()) {
            freqCount[count]++;
        }
        for (int freq = 1; freq <= n; freq++) {
            int countUniqueElementsRemove = Math.min(k / freq, freqCount[freq]);
            k -= (freq * countUniqueElementsRemove);

            uniqueElements -= countUniqueElementsRemove;

            if (k <= freq) {
                return uniqueElements;
            }
        }
        return 0;
    }
}