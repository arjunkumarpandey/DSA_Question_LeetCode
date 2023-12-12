class Solution {
    public int findSpecialInteger(int[] arr) {
       int res=arr[0],count=1;
       for(int i=1;i<arr.length;i++){
           if(arr[i]==arr[i-1]){
               count++;
           }
           else{
               count=1;
           }
           if((count*100.0/arr.length)>25){
             res=arr[i];
             break;
           }
       }
       return res; 
    }
}