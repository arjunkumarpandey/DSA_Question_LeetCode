class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch:tasks) {
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(mp.values());
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    temp.add(pq.poll()-1);
                }
            }
            for(int freq:temp){
                if(freq>0){
                    pq.offer(freq);
                }
            }

            if(pq.isEmpty()){
                time+=temp.size();
            }
            else{
                time+=(n+1);
            }
        }
        return time; 
    }
}
