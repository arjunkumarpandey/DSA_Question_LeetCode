class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
         int i=0;
        int a=1;
        while(i<nums.length){
            if(nums[i]==a)
            {
                a++;
            }
            else{
                i++;
            }
            
        }
        return a;
    }
}