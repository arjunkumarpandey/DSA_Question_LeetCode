class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] prefixSum=new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        int result=0;
        for(int i=0;i<n;i++){
            result=Math.max(result,binarySearch(i,k ,nums,prefixSum));
        }
        return result;
    }

    int binarySearch(int target_ind,int k,int[] nums,int[] prefixSum){
        int target=nums[target_ind];

        int l=0;
        int r=target_ind;
        int best_ind=target_ind;
        while(l<=r){
            int mid=l+(r-l)/2;
            int count=(target_ind-mid+1);
            int windowSum=count*target;
            int currSum=prefixSum[target_ind]-prefixSum[mid]+nums[mid];
            int ops=windowSum-currSum;
            if(ops>k){
                l=mid+1;

            }
            else{
                best_ind=mid;
                r=mid-1;
            }
        }
        return target_ind-best_ind+1;
    }
}