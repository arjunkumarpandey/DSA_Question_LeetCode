class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int start=0;
        int end=0;
        
        int satifies=0;
        int unsatifies=0;

       int i=0,j=0;
        
       while(j<minutes){
         if(grumpy[j]==0){
            satifies+=customers[j];
         }else{
            unsatifies+=customers[j];
         }  
         j++;
       }
       j=j-1;

       int currUnsatifies=unsatifies;
       while(j<n){

         if(currUnsatifies>=unsatifies){
            start=i;
            end=j;
            unsatifies=currUnsatifies;
         }

         i++;
         j++;
         if(j==n){
            break;
         }
//remove previous value
         if(grumpy[i-1]==0){
            satifies-=customers[i-1];
         }else{
            currUnsatifies-=customers[i-1];
         }
// add next value
         if(grumpy[j]==0){
            satifies+=customers[j];
         }else{
            currUnsatifies+=customers[j];
         }
         
       }

       int result=0;
       i=0;
       while(i<n){
         if(i>=start && i<=end){
            result+=customers[i];
         }
         else if(grumpy[i]==0){
            result+=customers[i];
         }
         i++;
       }
       return result;
    }
}