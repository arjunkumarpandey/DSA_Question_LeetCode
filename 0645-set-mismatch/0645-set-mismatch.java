class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
        int[] temp=new int[n]; 
        for(int i=0;i<n;i++){
            temp[nums[i]-1]++;
            if(temp[nums[i] - 1] > 1){
                arr[0]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(temp[i]==0){
                arr[1]=i+1;
                break;
            }
        }
        return arr;
    }
}

