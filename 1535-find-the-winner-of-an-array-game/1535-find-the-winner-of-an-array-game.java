class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        int i=0,j=1;
        int count=0;
        int win=arr[0];
        while(i<n && j<n){
            if(k==count){
                return arr[i];
            }
            if(arr[i]>arr[j]){
                j++;
                win=arr[i];
                count=count+1;
            }else{
                i=j;
                win=arr[j];
                j++;
                count=1;
            }    
        }
        return arr[i];
    }
}