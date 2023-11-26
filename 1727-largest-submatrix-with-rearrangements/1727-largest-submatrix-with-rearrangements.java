class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int area = 0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1 && i>0){
                    matrix[i][j]+=matrix[i-1][j];
                }
            }
            Integer[] height=new Integer[n];
            for(int k=0;k<n;k++){
                height[k]=matrix[i][k];
            }
            Arrays.sort(height, Collections.reverseOrder());
            for(int k=0;k<n;k++){
                int base=(k+1);
                int h=height[k];
                area=Math.max(area, base*h);
            }
        }
        return area;
    }
}
