class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum=0;
        List<List<Integer>> a = new ArrayList<>();
        if(nums.length < 3) return a;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2)
        {
            if(nums[i] > 0) break;
            int j=i+1;
            int k=nums.length-1;
            while(k>j)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0 && nums[i]==0 && nums[j]==0 && nums[j+1]==0)
                {
                 a.add(Arrays.asList(nums[i], nums[j], nums[j+1]));
                 return a;
                }

                if(sum==0)
                a.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) 
                while(nums[j] == nums[++j] && j < k);
                if(sum >= 0) 
                while(nums[k--] == nums[k] && j < k);
            
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return a;
    
    }
}