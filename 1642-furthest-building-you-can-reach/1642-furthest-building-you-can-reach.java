class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n=heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int i=0;
        for(;i<n-1;i++){
            if(heights[i]>=heights[i+1]){
                continue;
            }
            int diff=heights[i+1]-heights[i];
            if(diff<=bricks){
                pq.offer(diff);
                bricks=bricks-diff;
            }
            else if(ladders>0){
                if(!pq.isEmpty()){
                    int max_past_bricks=pq.peek();
                    if(diff<max_past_bricks){
                        bricks+=max_past_bricks;
                        pq.poll();
                        bricks-=diff;
                        pq.offer(diff);
                    }
                }
                ladders--;
            }
            else{
                break;
            }
        }
        return i;
    }
}