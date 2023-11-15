class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       int n=arr.length;
       Arrays.sort(arr);
       arr[0]=1;
       int res=arr[0];
       for(int i=1;i<n;i++){
           if(Math.abs(arr[i]-arr[i-1])<=1){
               res=Math.max(res,arr[i]);
           }
           else{
               arr[i]=arr[i-1]+1;
               res=Math.max(res,arr[i]);
           }
       }
       return res;
    }
}