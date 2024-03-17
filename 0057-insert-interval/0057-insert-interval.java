class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n && intervals[i][1] < newInterval[0]){
            temp.add(intervals[i++]);
        }

        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        temp.add(newInterval);
        while(i<n){
            temp.add(intervals[i++]);
        }
        int[][] result=new int[temp.size()][2];
        for(int j=0;j<temp.size();j++){
            result[j]=temp.get(j);
        }
        return  result;
    }
}
