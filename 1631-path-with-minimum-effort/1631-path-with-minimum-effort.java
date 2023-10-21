class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] directions = {{-1, 0},{0, -1},{0, 1},{1, 0}};
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], Integer.MAX_VALUE);
        }

        pq.offer(new int[]{0, 0});
        result[0][0] = 0;

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int diff = top[0];
            int i = top[1] / n;
            int j = top[1] % n;

            if (i == m - 1 && j == n - 1) {
                return diff;
            }

            for (int[] dir : directions) {
                int x = i + dir[0];
                int y = j + dir[1];

                if (x >= 0 && x < m && y >= 0 && y < n) {
                    int newDiff = Math.max(diff, Math.abs(heights[i][j] - heights[x][y]));
                    if (result[x][y] > newDiff) {
                        result[x][y] = newDiff;
                        pq.offer(new int[]{newDiff, x * n + y});
                    }
                }
            }
        }

        return result[m - 1][n - 1];
    }
}