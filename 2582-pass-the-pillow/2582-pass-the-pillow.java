class Solution {
    public int passThePillow(int n, int time) {
        int i=1;
        boolean flag=false;
        while(time>0){
            if(i==n || i==1){
                flag=!flag;
            }
            if(flag){
                i++;
                time--;
            }
            else{
                i--;
                time--;
            }
        }
        return i;
    }
}