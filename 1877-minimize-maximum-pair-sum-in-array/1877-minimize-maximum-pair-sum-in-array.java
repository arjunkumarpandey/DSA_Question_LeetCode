class Solution {
    public int minPairSum(int[] nums) {
     int sum=0;
     Arrays.sort(nums);
     int j=nums.length-1;
     int i=0;
     for(i=0;i<j;i++){
        int res=nums[i]+nums[j];
        sum=Math.max(res,sum);
        //i++;
        j--;
     }
    
     return sum; 
    }
}