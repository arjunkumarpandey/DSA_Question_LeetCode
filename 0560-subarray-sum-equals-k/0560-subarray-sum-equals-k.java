class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int res=0;
        int cSum=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            cSum+=nums[i];
            if(mp.containsKey(cSum-k)){
                res+=mp.get(cSum-k);
            }
            mp.put(cSum,mp.getOrDefault(cSum,0)+1);
        }
        return res;
    }
}