class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        Integer maj=null;
        for(int i=0;i<n;i++){
            if(maj!=null && nums[i]==maj){
                count++;
            }else if(count == 0){
                maj=nums[i];
                count=1;
            } else{
                count--;
            }
        }
        return maj;
    }
}