class Solution {
    int getNumBouq(int[] bloomDay,int mid,int k){
        int numOfBouquets = 0;
        int count = 0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }else{
                count=0;
            }
            if(count==k){
                numOfBouquets++;
                count=0;
            }
        }

        return numOfBouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<m*k){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, bloomDay[i]);
        }

        int l=1;
        int r=max;
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(getNumBouq(bloomDay,mid,k)>=m){
                result=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }
}