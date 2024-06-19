class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0;i*i<=c;i++){
            double x= Math.sqrt(c-i*i);
            if(x==(int)x){         
                return true;  
            }
        }
        return false;
    }
}