class Solution {
    int getMax(int[] nums){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
            }
        }
        return m;
    }
    public int maxFrequencyElements(int[] nums) {
        int max=getMax(nums);
        int[] arr=new int[max+1];
        for(int num:nums){
            arr[num]++;
        }
        Arrays.sort(arr);
        int result=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==arr[i+1]){
                result+=arr[i+1];
            }
            else{
                break;
            }
        }
        return result;
    }
}