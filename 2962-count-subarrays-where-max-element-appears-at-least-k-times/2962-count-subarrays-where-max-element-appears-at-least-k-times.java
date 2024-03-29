class Solution {
    public long countSubarrays(int[] nums, int k) {
       int n=nums.length;
       int max=Integer.MIN_VALUE;;
       for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
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
