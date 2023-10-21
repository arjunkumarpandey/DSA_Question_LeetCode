class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int res=0;
        
        for(int i=0;i<n;i++)
        {
             int count=1;
             if( nums[i]==-1)
             continue;

            for(int j=i+1;j<=n-1;j++)
            {
                if(nums[i]==nums[j] && nums[i]!=-1 && nums[j]!= -1)
                {
                    count++;
                    nums[j]=-1;
                }
            }
            if(count==1){
                res=nums[i];
            }
        }
        return res;
    }
}