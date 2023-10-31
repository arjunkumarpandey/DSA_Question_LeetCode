class Solution {
    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int[] t = new int[n];
        for(int i=0;i<n;i++)
        {
            t[i]=nums[i];
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.first, a.first));
        pq.offer(new Pair(t[0], 0));
        int result = t[0];

        for (int i = 1; i < n; i++) {
            while (!pq.isEmpty() && pq.peek().second < i - k) {
                pq.poll();
            }

            t[i] = Math.max(t[i], nums[i] + pq.peek().first);
            pq.offer(new Pair(t[i], i));

            result = Math.max(result, t[i]);
        }

        return result;
    }
}