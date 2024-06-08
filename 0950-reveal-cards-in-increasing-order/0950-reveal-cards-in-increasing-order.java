class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int[] arr=new int[n];
        Arrays.sort(deck);
        int j=0;
        int i=0;
        boolean skip=false;
        while(i<n){
            if(arr[j]==0){
                if(skip==false){
                    arr[j]=deck[i];
                    i++;
                } 
                skip=!skip;
            }
            j=(j+1)%n;
        }
        return arr;
    }
}