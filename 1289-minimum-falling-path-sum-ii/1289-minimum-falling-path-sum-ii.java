class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int[][] dp=new int[n][n];
        
        int firstMinIndex=-1;
        int secondMinIndex=-1;

        for(int i=0;i<n;i++){
            dp[n-1][i]=grid[n-1][i];

            if (firstMinIndex==-1 || dp[n-1][i] <= dp[n-1][firstMinIndex]){
                secondMinIndex=firstMinIndex;
                firstMinIndex=i;
            } else if(secondMinIndex == -1 || dp[n-1][i] < dp[n-1][secondMinIndex]){
                secondMinIndex=i;
            }
        }

        for(int row=n-2;row>=0;row--){
            int currRowMinIndex1=-1;
            int currRowMinIndex2=-1;

            for(int col=0;col<n;col++){
                if(col!=firstMinIndex){
                    dp[row][col]=grid[row][col]+dp[row+1][firstMinIndex];
                }
                else{
                   dp[row][col]=grid[row][col]+dp[row+1][secondMinIndex]; 
                }

                if (currRowMinIndex1==-1 || dp[row][col] <= dp[row][currRowMinIndex1]){
                    currRowMinIndex2=currRowMinIndex1;
                    currRowMinIndex1=col;
                } else if(currRowMinIndex2 == -1 || dp[row][col] < dp[row][currRowMinIndex2]){
                    currRowMinIndex2=col;
                }
            }
            firstMinIndex=currRowMinIndex1;
            secondMinIndex=currRowMinIndex2;
        }

        return dp[0][firstMinIndex];
    }
}
/*
DP top up approach + memorization ---> TC=O(n^n*n)
class Solution {
    int n;
    int[][] dp;

    int solver(int col,int row,int[][] grid){
        if(row==n-1){
            return grid[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int ans=Integer.MAX_VALUE;
        for(int nextcol=0;nextcol<n;nextcol++){
            if(nextcol!=col){
                ans=Math.min(ans,solver(nextcol,row+1,grid));
            }
        }
        return dp[row][col]=ans+grid[row][col];
    }
    public int minFallingPathSum(int[][] grid) {
        n=grid.length;
        dp=new int[201][201];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }

        int result=Integer.MAX_VALUE;
        for(int col=0;col<n;col++){
            result=Math.min(result,solver(col,0,grid));
        }
        return result;
    }
}
*/