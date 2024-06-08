class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Math.abs((s.charAt(i)-'a')-(t.charAt(i)-'a'));
        }
        int i=0,j=0;
        int currCost=0,maxLength=0;
        while(j<n){
            currCost+=arr[j];
            while(currCost>maxCost){
                currCost-=arr[i];
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}