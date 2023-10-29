class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
       int T=(minutesToTest/minutesToDie)+1;
       int P=0;
       while(Math.pow(T,P)<buckets){
           P++;
       }
       return P;
    }
}