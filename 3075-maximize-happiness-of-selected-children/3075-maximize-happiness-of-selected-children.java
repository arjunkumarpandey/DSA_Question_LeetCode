class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        long result=0;
        int count=0;
        for(int i=n-1;i>=n-k;i--){
            happiness[i]=Math.max(happiness[i]-count++,0);
            result+=happiness[i];
        }
        return result;
    }
}