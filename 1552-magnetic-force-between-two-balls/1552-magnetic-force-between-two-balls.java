class Solution {
    public boolean check(int[] position,int mid,int m){
        int prev=position[0];
        int count=1;

        for(int i=1;i<position.length;i++){
            int curr=position[i];
            if(curr-prev>=mid){
                count++;
                prev=curr;
            }
            if(count==m){
                break;
            }
        }
        return count==m;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);

        if(m==2){
            return position[n-1]-position[0]; 
        }

        int l=1;
        int r=(position[n-1]-position[0]);

        int result=0;
        
        while(l<=r){
            int mid=l+(r-l)/2;

            if(check(position,mid,m)){
                result=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return result;
    }
}