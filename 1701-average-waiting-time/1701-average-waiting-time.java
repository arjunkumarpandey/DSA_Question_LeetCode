class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        double result=(double) customers[0][1];
        int wait=customers[0][0]+customers[0][1];
        for(int i=1;i<n;i++){
            int extra=0;
            if(wait>customers[i][0]){
                extra=wait-customers[i][0];
                wait+=customers[i][1];
            }else{
                wait=customers[i][0]+customers[i][1];
            }
            result+=extra+customers[i][1];
            
        }
        return result/n;
    }
}