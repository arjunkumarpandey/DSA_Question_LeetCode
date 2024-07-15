class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int h=horizontalCut.length;
        int v=verticalCut.length;

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        int horiPart=1,vertiPart=1,i=h-1,j=v-1;
        long result=0;

        while(i>=0 && j>=0){
            if(horizontalCut[i]>=verticalCut[j]){
                result+=(horizontalCut[i--]*vertiPart);
                horiPart++;
            }else{
               result+=(verticalCut[j--]*horiPart);
                vertiPart++; 
            }
        }
        while(i>=0){
            result+=(horizontalCut[i--]*vertiPart);
            horiPart++;
        }
        while(j>=0){
            result+=(verticalCut[j--]*horiPart);
            vertiPart++;
        }
        return result;
    }
}