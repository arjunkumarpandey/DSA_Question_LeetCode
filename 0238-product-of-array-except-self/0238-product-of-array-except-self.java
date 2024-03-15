class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int temp=1;
        int zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
                continue;
            }
            else{
                temp=temp*nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0 && zero==1){ 
                nums[i]=temp;
            }
            else if(nums[i]!=0 && zero==0){
                nums[i]=temp/nums[i];
            }
            else{
                nums[i]=0;
            }
        }
        return nums;
    }
}