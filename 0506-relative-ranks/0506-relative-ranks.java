import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer, Integer>> pq=new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        for(int i=0;i<score.length;i++){
            pq.add(new Pair<>(score[i],i));
        }
        String[] str=new String[score.length];
        int i=1;
        while(!pq.isEmpty()){
            Pair<Integer,Integer> pt=pq.poll();
            int index=pt.getValue();
            if(i==1){
                str[index]="Gold Medal";
            }else if(i==2){
                str[index]="Silver Medal";
            }else if(i==3){
                str[index] = "Bronze Medal";
            }else{
                str[index]=String.valueOf(i);
            }
            i++;
        }
        return str;
    }
}
