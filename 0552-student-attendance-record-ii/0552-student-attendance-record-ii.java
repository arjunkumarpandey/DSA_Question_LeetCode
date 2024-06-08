class Solution {
    int mod = 1000000007;
    int[][][] dp;
    int solver(int n,int absent,int late){
        if(absent>=2 || late>=3){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        if(dp[n][absent][late]!=-1){
            return dp[n][absent][late];
        }

        int A=solver(n-1,absent+1,0)%mod;
        int L=solver(n-1,absent,late+1)%mod;
        int P=solver(n-1,absent,0)%mod;

        return dp[n][absent][late]=((A+L)%mod+P)%mod;
    }
    public int checkRecord(int n) {
        dp=new int[n+1][2][3];
        for(int i=0;i<=n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solver(n,0,0);
    }
}