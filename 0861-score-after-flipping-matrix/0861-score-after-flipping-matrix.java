class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                for(int j=0;j<m;j++){
                    grid[i][j]=1-grid[i][j];
                }
            }
        }
        for(int i=1;i<m;i++){
            int countZero=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==0){
                    countZero++;
                }
            }
            int countOne=n-countZero;
            if(countZero>countOne){
                for(int k=0;k<n;k++){
                    grid[k][i]=1-grid[k][i];
                }
            }
        }

        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int value=grid[i][j]*(int)(Math.pow(2,m-j-1));
                result+=value;
            }
        }
        return result;
    }
}
