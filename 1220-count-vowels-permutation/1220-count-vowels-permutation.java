class Solution {
    private int M = 1000000007;
    private int a=0,e=1,i=2,o=3,u=4;
    private long[][] t;
    public int countVowelPermutation(int n) {
        t=new long[5][n+1];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(t[i], -1);
        }

        long result=0;

        result=(result+solver(a,n-1))%M;
        result=(result+solver(e,n-1))%M;
        result=(result+solver(i,n-1))%M;
        result=(result+solver(o,n-1))%M;
        result=(result+solver(u,n-1))%M;

        return (int)result;
    }
    long solver(int ch,int n){
        if(n==0){
            return 1;
        }
        
        if(t[ch][n]!=-1)
        {
            return t[ch][n];
        }
        
        if(ch==a)
        {
             t[ch][n]=solver(e,n-1)%M;
        }
        else if(ch==e){
             t[ch][n]=(solver(a,n-1)+solver(i,n-1))%M;
        }
        else if(ch==i){
             t[ch][n]=(solver(a,n-1)+solver(e,n-1)+solver(o,n-1)+solver(u,n-1))%M;
        }
        else if(ch==o){
            t[ch][n]=(solver(i,n-1)+solver(u,n-1))%M;
        }
        else{
             t[ch][n]=(solver(a,n-1))%M;
        }
        
        return t[ch][n];
    }
}