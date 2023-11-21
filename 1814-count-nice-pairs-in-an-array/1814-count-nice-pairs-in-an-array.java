class Solution {
    public int countNicePairs(int[] nums) {
        int n=nums.length;
        int res=0;
        Map<Integer,Integer> fre=new HashMap<>();
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-rev(nums[i]); 
        }
        
        for (int i = 0; i < n; i++) {
            res = (int) ((res + fre.getOrDefault(nums[i], 0)) % 1000000007);
            fre.put(nums[i], fre.getOrDefault(nums[i], 0) + 1);
        }
        
        return res;
    }
    int rev(int r){
        String str=Integer.toString(r);
        StringBuilder reversedStr=new StringBuilder(str).reverse();
        int reversedNum=Integer.parseInt(reversedStr.toString());
        return reversedNum;
    }
}