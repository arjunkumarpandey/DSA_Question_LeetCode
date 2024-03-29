class Solution {
    public int getMax(int[] nums){
        int maxElement=Integer.MIN_VALUE;
        for(int k=0;k<nums.length;k++){
            if(maxElement<nums[k]){
                maxElement=nums[k];
            }
        }
        return maxElement;
    }
    public long countSubarrays(int[] nums, int k) {
       int n=nums.length;
       int max=getMax(nums);
       int i=0,j=0;
       int count=0;
       long ans=0;
       while(j<n || i>j){
          if(nums[j]==max){
            count++;
          }
          while(i<=j && count>=k){
              if(nums[i]==max){
                  count--;
              }
              i++;
              ans+=n-j;
          }
          j++;
       }
       return ans;
    }
}
