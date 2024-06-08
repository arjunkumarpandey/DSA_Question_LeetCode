class Solution {
    int n,m;
    int solver(int[][] grid,int i,int j){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0){
            return 0;
        }
        int sum=grid[i][j];
        grid[i][j]=0;

        int gold=0;
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};

        for(int x=0;x<4;x++){
            gold=Math.max(gold, solver(grid, i + dx[x], j + dy[x]));
        }
        grid[i][j] = sum;
        return gold+sum;
    }

    public int getMaximumGold(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int result=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    result=Math.max(result,solver(grid,i,j));
                }
                
            }
        }
        return result;
    }
}