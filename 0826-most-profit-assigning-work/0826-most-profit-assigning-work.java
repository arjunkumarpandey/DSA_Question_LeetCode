class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        int m=worker.length;
         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{profit[i], difficulty[i]});
        }

        Arrays.sort(worker);
        int i=m-1;
        int result=0;
        while(i>=0 && !pq.isEmpty()){
            if(pq.peek()[1]>worker[i]){
                pq.poll();
            
            }else{
                result+=pq.peek()[0];
                i--;
            }
        }
        return result;
    }
}