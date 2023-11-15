class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int maxEl = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }

            maxEl = Math.max(maxEl, arr[i]);
        }

        return maxEl;
    }
}