class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[0], b[0]));
        int[][] arr=new int[points.length][2];
        arr[0]=points[0];
        int result=1;
        for(int i=1;i<points.length;i++){
            int[] currPoint=points[i];
            int[] prevPoint=arr[result-1];
            if(currPoint[0]>prevPoint[1]){
                arr[result++]=currPoint;
            } else{
                prevPoint[0]=Math.max(prevPoint[0],currPoint[0]);
                prevPoint[1]=Math.min(prevPoint[1],currPoint[1]);
            }
        }
        return result;
    }
}