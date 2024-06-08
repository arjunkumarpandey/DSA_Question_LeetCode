class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
            x=x^nums[i];
        }
        int xor=x^k;
        int count=0;
        while(xor!=0){
            count+=xor & 1;
            xor >>=1;
        }
        return count;
    }
}