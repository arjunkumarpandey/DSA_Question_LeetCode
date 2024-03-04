class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
       int n=tokens.length;
       int score=0,i=0,j=n-1;
       Arrays.sort(tokens);
       while(i<=j){
           if(tokens[i]<=power){
               score++;
               power -= tokens[i];
               i++;
           }
           else if(i!=j && score>0){
               power+=tokens[j];
               score--;
               j--;
           }
           else{
               break;
           }
       }
       return score;
    }
}