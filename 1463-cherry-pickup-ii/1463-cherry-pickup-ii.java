class Solution {
    int m,n;
    int[][][] dp=new int[71][71][71];
    int solver(int[][] grid,int row,int c1,int c2){
        if(row>=m){
            return 0;
        }
        if(dp[row][c1][c2]!=-1){
            return dp[row][c1][c2];
        }
        int cherry=grid[row][c1];
        if(c1!=c2){
            cherry+=grid[row][c2];
        }
        int ans=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int newRow=row+1;
                int new_c1=c1+i;
                int new_c2=c2+j;

                if(new_c1>=0 && new_c1<n && new_c2>=0 && new_c2<n){
                    ans=Math.max(ans,solver(grid,newRow,new_c1,new_c2));
                }
            }
        }
        return dp[row][c1][c2]=cherry+ans;
    }
    public int cherryPickup(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solver(grid,0,0,n-1);
    }
}