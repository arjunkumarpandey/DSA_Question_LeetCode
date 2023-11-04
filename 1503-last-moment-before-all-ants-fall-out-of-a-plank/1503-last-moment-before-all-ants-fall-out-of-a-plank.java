class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int result=0;
        for(int x:left){
            result=Math.max(result,x);
        }
        for(int x:right){
            result=Math.max(result,n-x);
        }
        return result;
    }
}