class Solution {
    public int reductionOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(nums[0]==nums[n-1]){
            return 0;
        }
        int result=0;
        int sum=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                sum+=1;
                result+=sum;
            }
            else{
                result+=sum;
            }
        }
        return result;    
    }
}