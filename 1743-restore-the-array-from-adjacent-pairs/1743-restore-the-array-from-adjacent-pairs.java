public class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
       Map<Integer, List<Integer>> pairs = new LinkedHashMap<>();

        for (int[] pair : adjacentPairs) {
            pairs.computeIfAbsent(pair[0], key -> new ArrayList<>()).add(pair[1]);
            pairs.computeIfAbsent(pair[1], key -> new ArrayList<>()).add(pair[0]);
        }

        int n = adjacentPairs.length + 1;
        int[] ans = new int[n];
        int start = 0;
        for (int key : pairs.keySet()) {
            if (pairs.get(key).size() == 1) {
                start = key;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            ans[i] = start;
            List<Integer> neighbors = pairs.get(start);
            
            if (neighbors != null && !neighbors.isEmpty()) {
                start = neighbors.get(0);
                
                pairs.get(start).remove(Integer.valueOf(ans[i]));
                neighbors.remove(Integer.valueOf(start));
            
                if (pairs.get(ans[i]).isEmpty()) {
                    pairs.remove(ans[i]);
                }
            }
        }
        return ans;
    }
}
