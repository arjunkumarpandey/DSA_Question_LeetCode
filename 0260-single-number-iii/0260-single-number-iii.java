class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        int mask=(xor) & (-xor);
        int num1=0,num2=0;

        for(int num:nums){
            if((num & mask)==0){
                num1^=num;
            }else{
                num2^=num;
            }
        }
        return new int[]{num1, num2};
    }
}