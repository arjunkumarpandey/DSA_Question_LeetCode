class Solution {
   // this method is not so good 
   // The right methdo is binary search 
    public int searchInsert(int[] nums, int target) {
        int a=0;
        if(nums.length==1 && nums[0]<target) return 1;    
        for(int i=0;i<nums.length-1;i++)
        {
            int b=a;
            if(nums[i]<target && nums[i+1]>=target)
            {
                return i+1;
            }
            else if(nums[0]==target || nums[0]>target) return 0;
            else
            {
                a=i+2;
            }
        }
        return a;
    }
}

// Binary search Method 
/*  
        int first=0;
        int last=nums.length-1;
        
        while(first<=last)
        {
            int mid =first+(last-first)/2;
            if(nums[mid]==target) return mid;

            else if(nums[mid]>target) last=mid-1;

            else  first=mid+1;
        }
        return first;*/