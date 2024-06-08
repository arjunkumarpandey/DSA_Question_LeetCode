class Solution {
    int[][] dp;
    int countSteps(int ringIndex,int i,int n){
        int antiClock=Math.abs(i-ringIndex);
        int clock=Math.abs(n-antiClock);

        return Math.min(antiClock,clock);
    }
    int solver(int ringIndex,int keyIndex,String ring,String key){
        if(keyIndex==key.length()){
            return 0;
        }
        if(dp[ringIndex][keyIndex]!=-1){
            return dp[ringIndex][keyIndex];
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<ring.length();i++){
            if(ring.charAt(i)==key.charAt(keyIndex)){
                int totalSteps=countSteps(ringIndex,i,ring.length())+1+solver(i,keyIndex+1,ring,key);
                result=Math.min(result,totalSteps);
            }
        }
        return dp[ringIndex][keyIndex]=result;
    }
    public int findRotateSteps(String ring, String key) {
        dp=new int[101][101];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solver(0,0,ring,key);
    }
}