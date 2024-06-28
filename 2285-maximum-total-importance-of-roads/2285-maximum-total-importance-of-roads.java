class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] count=new int[n];
        for(int[] arr:roads){
            count[arr[0]]++;
            count[arr[1]]++;
        }

        Arrays.sort(count);
        long result=0;
        int value=1;

        for(int i=0;i<count.length;i++){
            result+=(long)count[i]*value++;
        }
        return result;
    }
}