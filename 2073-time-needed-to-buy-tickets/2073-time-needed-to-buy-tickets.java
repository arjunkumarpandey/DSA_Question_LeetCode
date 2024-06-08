class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int time=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(tickets[i]>=tickets[k]){
                time+=tickets[k];
                if(i>k){
                    count++;
                }
            }
            else{
                time+=tickets[i];
            }
            
        }
        return time-count;
    }
}