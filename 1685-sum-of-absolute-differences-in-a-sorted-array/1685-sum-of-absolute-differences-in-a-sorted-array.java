class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=nums[i];
        }
        int preSum=0;
        for(int i=0;i<n;i++){
            result[i]=(nums[i]*i)-preSum+(sum-preSum-nums[i])-(nums[i]*(n-i-1));
            preSum+=nums[i];
        }
        return result;
    }
}