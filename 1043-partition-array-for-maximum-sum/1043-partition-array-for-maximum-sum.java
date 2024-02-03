class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[501];
        for(int i=0;i<501;i++){
            dp[i]=-1;
        }
        return solver(0,arr,k,dp);
    }
    int solver(int i,int[] arr, int k,int[] dp){
        if(i>=arr.length)
        return 0;
         if(dp[i]!=-1){
            return dp[i];
        }
        int res=0;
        int curr_max=-1;
        for(int j=i;j<arr.length && j-i+1<=k;j++){
            curr_max=Math.max(curr_max,arr[j]);
            res=Math.max(res,(j-i+1)*curr_max+solver(j+1,arr,k,dp));
        }
        return dp[i]=res;
    }
}