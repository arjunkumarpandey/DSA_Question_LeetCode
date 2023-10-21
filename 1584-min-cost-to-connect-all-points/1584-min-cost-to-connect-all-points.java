class Solution {
    class Pair {
        int vertex;
        int weight;

        public Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<List<Pair>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] p1 = points[i];
                int[] p2 = points[j];
                int distance = Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);

                adj.get(i).add(new Pair(j, distance));
                adj.get(j).add(new Pair(i, distance)); 
            }
        }
        return primsAlgo(n, adj);
    }

    public int primsAlgo(int V, List<List<Pair>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        pq.offer(new Pair(0, 0));

        boolean[] inMST = new boolean[V];
        int sum = 0;

        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            int wt = p.weight;
            int node = p.vertex;

            if (inMST[node])
                continue;

            inMST[node] = true;
            sum += wt;

            for (Pair tmp : adj.get(node)) {
                int neighbor = tmp.vertex;
                int neighbor_wt = tmp.weight;

                if (!inMST[neighbor]) {
                    pq.offer(new Pair(neighbor, neighbor_wt));
                }
            }
        }

        return sum;
    }
}