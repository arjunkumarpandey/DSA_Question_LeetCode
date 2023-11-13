class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;

        for(int i=0; i<nums.length-2;i++) {
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int res=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(res-target);
                if(diff<sum){
                    sum=diff;
                    ans=res;
                }
                if(res<target) {
                    left++;
                }else{
                    right--;
                }
            }
        }

        return ans;
    }
}
