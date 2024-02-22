class Solution {
    public int findJudge(int n, int[][] trust) {
     int[] arr=new int[n+1];
     for(int[] temp:trust){
         int first=temp[0];
         int second=temp[1];
         arr[first]--;
         arr[second]++;
     }   
     for(int i=1;i<arr.length;i++){
         if(arr[i]==n-1){
             return i;
         }
     }
     return -1;
    }
}