class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        int i=1;
        while(i!=nums.length)
        {
            if(nums[j]%2==0)
            {
                j++;
            }
            if(nums[i]%2==0 && nums[j]%2!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;     
            }
            i++;
        }
        return nums;
    }
}