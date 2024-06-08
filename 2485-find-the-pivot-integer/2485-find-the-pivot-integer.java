class Solution {
    public int pivotInteger(int n) {
        int[] left=new int[n+1];
        int[] right=new int[n+1];
        int sum=0;
        for(int i=0;i<=n;i++){
            left[i]=sum+i;
            sum+=i;
        }
        sum=0;
        for(int i=n;i>=0;i--){
            right[i]=sum+i;
            sum+=i;
        }

        for(int i=0;i<=n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}