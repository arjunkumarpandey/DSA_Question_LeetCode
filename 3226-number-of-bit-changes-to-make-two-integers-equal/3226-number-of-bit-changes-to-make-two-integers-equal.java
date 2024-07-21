class Solution {
    public int minChanges(int n, int k) {
        if(n==k) return 0;

        int result=0;
        while(n>0 || k>0){
            if(n%2!=0 && k%2==0){
                result++;
            }
            else if(n%2==0 && k%2!=0){
                return -1;
            }
            n=n/2;
            k=k/2;
        }
        return result;
    }
}