class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] result = {-1, -1};
        if(n==0) return result;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                result[j]=i;  
                result[1]=i;
                if(j<1) j++;
            }
            if(nums[n-1]!=target && i==n-1)
            {
                return result;
            }
        }
        return result;
    }
}