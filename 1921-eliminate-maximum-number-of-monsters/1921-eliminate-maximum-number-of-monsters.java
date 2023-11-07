class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {

        for(int i=0;i<dist.length;i++){
            dist[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }

        Arrays.sort(dist);

        for(int i=0;i<dist.length;i++){
            if(dist[i]<=i){
                return i;
            }
        }
        return dist.length;
    }
}